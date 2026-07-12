package com.yodo1.mas.ui.seekbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.yodo1.mas.ui.seekbar.SavedState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedState createFromParcel(Parcel in) {
            return new SavedState(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedState[] newArray(int size) {
            return new SavedState[size];
        }
    };
    public float currSelectedMax;
    public float currSelectedMin;
    public float maxValue;
    public float minValue;
    public float rangeInterval;
    public int tickNumber;

    public SavedState(Parcelable superState) {
        super(superState);
    }

    private SavedState(Parcel in) {
        super(in);
        this.minValue = in.readFloat();
        this.maxValue = in.readFloat();
        this.rangeInterval = in.readFloat();
        this.tickNumber = in.readInt();
        this.currSelectedMin = in.readFloat();
        this.currSelectedMax = in.readFloat();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeFloat(this.minValue);
        out.writeFloat(this.maxValue);
        out.writeFloat(this.rangeInterval);
        out.writeInt(this.tickNumber);
        out.writeFloat(this.currSelectedMin);
        out.writeFloat(this.currSelectedMax);
    }
}
