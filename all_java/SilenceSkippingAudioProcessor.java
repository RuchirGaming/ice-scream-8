package com.mbridge.msdk.playercommon.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class SilenceSkippingAudioProcessor implements AudioProcessor {
    private static final long MINIMUM_SILENCE_DURATION_US = 150000;
    private static final long PADDING_SILENCE_US = 20000;
    private static final short SILENCE_THRESHOLD_LEVEL = 1024;
    private static final byte SILENCE_THRESHOLD_LEVEL_MSB = 4;
    private static final int STATE_MAYBE_SILENT = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SILENT = 2;
    private int bytesPerFrame;
    private boolean enabled;
    private boolean hasOutputNoise;
    private boolean inputEnded;
    private int maybeSilenceBufferSize;
    private int paddingSize;
    private long skippedFrames;
    private int state;
    private ByteBuffer buffer = EMPTY_BUFFER;
    private ByteBuffer outputBuffer = EMPTY_BUFFER;
    private int channelCount = -1;
    private int sampleRateHz = -1;
    private byte[] maybeSilenceBuffer = new byte[0];
    private byte[] paddingBuffer = new byte[0];

    private @interface State {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputEncoding() {
        return 2;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
        flush();
    }

    public final long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean configure(int i2, int i3, int i4) throws AudioProcessor.UnhandledFormatException {
        if (i4 != 2) {
            throw new AudioProcessor.UnhandledFormatException(i2, i3, i4);
        }
        if (this.sampleRateHz == i2 && this.channelCount == i3) {
            return false;
        }
        this.sampleRateHz = i2;
        this.channelCount = i3;
        this.bytesPerFrame = i3 * 2;
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.sampleRateHz != -1 && this.enabled;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputChannelCount() {
        return this.channelCount;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputSampleRateHz() {
        return this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.outputBuffer.hasRemaining()) {
            int i2 = this.state;
            if (i2 == 0) {
                processNoisy(byteBuffer);
            } else if (i2 == 1) {
                processMaybeSilence(byteBuffer);
            } else if (i2 == 2) {
                processSilence(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        int i2 = this.maybeSilenceBufferSize;
        if (i2 > 0) {
            output(this.maybeSilenceBuffer, i2);
        }
        if (this.hasOutputNoise) {
            return;
        }
        this.skippedFrames += (long) (this.paddingSize / this.bytesPerFrame);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        return this.inputEnded && this.outputBuffer == EMPTY_BUFFER;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            int iDurationUsToFrames = durationUsToFrames(MINIMUM_SILENCE_DURATION_US) * this.bytesPerFrame;
            if (this.maybeSilenceBuffer.length != iDurationUsToFrames) {
                this.maybeSilenceBuffer = new byte[iDurationUsToFrames];
            }
            int iDurationUsToFrames2 = durationUsToFrames(PADDING_SILENCE_US) * this.bytesPerFrame;
            this.paddingSize = iDurationUsToFrames2;
            if (this.paddingBuffer.length != iDurationUsToFrames2) {
                this.paddingBuffer = new byte[iDurationUsToFrames2];
            }
        }
        this.state = 0;
        this.outputBuffer = EMPTY_BUFFER;
        this.inputEnded = false;
        this.skippedFrames = 0L;
        this.maybeSilenceBufferSize = 0;
        this.hasOutputNoise = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.enabled = false;
        flush();
        this.buffer = EMPTY_BUFFER;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.paddingSize = 0;
        this.maybeSilenceBuffer = new byte[0];
        this.paddingBuffer = new byte[0];
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(iFindNoiseLimit);
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void processMaybeSilence(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        byte[] bArr = this.maybeSilenceBuffer;
        int length = bArr.length;
        int i2 = this.maybeSilenceBufferSize;
        int i3 = length - i2;
        if (iFindNoisePosition < iLimit && iPosition < i3) {
            output(bArr, i2);
            this.maybeSilenceBufferSize = 0;
            this.state = 0;
            return;
        }
        int iMin = Math.min(iPosition, i3);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.maybeSilenceBuffer, this.maybeSilenceBufferSize, iMin);
        int i4 = this.maybeSilenceBufferSize + iMin;
        this.maybeSilenceBufferSize = i4;
        byte[] bArr2 = this.maybeSilenceBuffer;
        if (i4 == bArr2.length) {
            if (this.hasOutputNoise) {
                output(bArr2, this.paddingSize);
                this.skippedFrames += (long) ((this.maybeSilenceBufferSize - (this.paddingSize * 2)) / this.bytesPerFrame);
            } else {
                this.skippedFrames += (long) ((i4 - this.paddingSize) / this.bytesPerFrame);
            }
            updatePaddingBuffer(byteBuffer, this.maybeSilenceBuffer, this.maybeSilenceBufferSize);
            this.maybeSilenceBufferSize = 0;
            this.state = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void processSilence(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        byteBuffer.limit(iFindNoisePosition);
        this.skippedFrames += (long) (byteBuffer.remaining() / this.bytesPerFrame);
        updatePaddingBuffer(byteBuffer, this.paddingBuffer, this.paddingSize);
        if (iFindNoisePosition < iLimit) {
            output(this.paddingBuffer, this.paddingSize);
            this.state = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void output(byte[] bArr, int i2) {
        prepareForOutput(i2);
        this.buffer.put(bArr, 0, i2);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    private void output(ByteBuffer byteBuffer) {
        prepareForOutput(byteBuffer.remaining());
        this.buffer.put(byteBuffer);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    private void prepareForOutput(int i2) {
        if (this.buffer.capacity() < i2) {
            this.buffer = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        if (i2 > 0) {
            this.hasOutputNoise = true;
        }
    }

    private void updatePaddingBuffer(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.paddingSize);
        int i3 = this.paddingSize - iMin;
        System.arraycopy(bArr, i2 - i3, this.paddingBuffer, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.paddingBuffer, i3, iMin);
    }

    private int durationUsToFrames(long j2) {
        return (int) ((j2 * ((long) this.sampleRateHz)) / 1000000);
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.get(iPosition)) > 4) {
                int i2 = this.bytesPerFrame;
                return i2 * (iPosition / i2);
            }
        }
        return byteBuffer.limit();
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (Math.abs((int) byteBuffer.get(iLimit)) > 4) {
                int i2 = this.bytesPerFrame;
                return ((iLimit / i2) * i2) + i2;
            }
        }
        return byteBuffer.position();
    }
}
