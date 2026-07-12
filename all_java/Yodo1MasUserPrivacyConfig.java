package com.yodo1.mas.helper.model;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasUserPrivacyConfig {
    private final int buttonBackgroundColor;
    private final int buttonTextColor;
    private final int contentBackgroundColor;
    private final int contentTextColor;
    private final int titleBackgroundColor;
    private final int titleTextColor;

    public Yodo1MasUserPrivacyConfig(Builder builder) {
        this.titleBackgroundColor = builder.titleBackgroundColor;
        this.titleTextColor = builder.titleTextColor;
        this.contentBackgroundColor = builder.contentBackgroundColor;
        this.contentTextColor = builder.contentTextColor;
        this.buttonBackgroundColor = builder.buttonBackgroundColor;
        this.buttonTextColor = builder.buttonTextColor;
    }

    public int getTitleBackgroundColor() {
        return this.titleBackgroundColor;
    }

    public int getTitleTextColor() {
        return this.titleTextColor;
    }

    public int getContentBackgroundColor() {
        return this.contentBackgroundColor;
    }

    public int getContentTextColor() {
        return this.contentTextColor;
    }

    public int getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public int getButtonTextColor() {
        return this.buttonTextColor;
    }

    public static class Builder {
        private int buttonBackgroundColor;
        private int buttonTextColor;
        private int contentBackgroundColor;
        private int contentTextColor;
        private int titleBackgroundColor;
        private int titleTextColor;

        public Builder titleBackgroundColor(int titleBackgroundColor) {
            this.titleBackgroundColor = titleBackgroundColor;
            return this;
        }

        public Builder titleTextColor(int titleTextColor) {
            this.titleTextColor = titleTextColor;
            return this;
        }

        public Builder contentBackgroundColor(int contentBackgroundColor) {
            this.contentBackgroundColor = contentBackgroundColor;
            return this;
        }

        public Builder contentTextColor(int contentTextColor) {
            this.contentTextColor = contentTextColor;
            return this;
        }

        public Builder buttonBackgroundColor(int buttonBackgroundColor) {
            this.buttonBackgroundColor = buttonBackgroundColor;
            return this;
        }

        public Builder buttonTextColor(int buttonTextColor) {
            this.buttonTextColor = buttonTextColor;
            return this;
        }

        public Yodo1MasUserPrivacyConfig build() {
            return new Yodo1MasUserPrivacyConfig(this);
        }
    }
}
