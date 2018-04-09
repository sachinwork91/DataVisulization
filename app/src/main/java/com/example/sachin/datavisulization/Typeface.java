package com.example.sachin.datavisulization;

/**
 * Created by Sachin on 2018-04-08.
 */


import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import java.io.File;
import java.io.FileDescriptor;

public class Typeface {
    public static final int BOLD = 1;
    public static final int BOLD_ITALIC = 3;
    public static final android.graphics.Typeface DEFAULT = null;
    public static final android.graphics.Typeface DEFAULT_BOLD = null;
    public static final int ITALIC = 2;
    public static final android.graphics.Typeface MONOSPACE = null;
    public static final int NORMAL = 0;
    public static final android.graphics.Typeface SANS_SERIF = null;
    public static final android.graphics.Typeface SERIF = null;

    Typeface() {
        throw new RuntimeException("Stub!");
    }

    public int getStyle() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isBold() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isItalic() {
        throw new RuntimeException("Stub!");
    }

    public static android.graphics.Typeface create(String familyName, int style) {
        throw new RuntimeException("Stub!");
    }

    public static android.graphics.Typeface create(android.graphics.Typeface family, int style) {
        throw new RuntimeException("Stub!");
    }

    public static android.graphics.Typeface defaultFromStyle(int style) {
        throw new RuntimeException("Stub!");
    }

    public static android.graphics.Typeface createFromAsset(AssetManager mgr, String path) {
        throw new RuntimeException("Stub!");
    }

    public static android.graphics.Typeface createFromFile(File path) {
        throw new RuntimeException("Stub!");
    }

    public static android.graphics.Typeface createFromFile(String path) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public static final class Builder {
        public Builder(File path) {
            throw new RuntimeException("Stub!");
        }

        public Builder(FileDescriptor fd) {
            throw new RuntimeException("Stub!");
        }

        public Builder(String path) {
            throw new RuntimeException("Stub!");
        }

        public Builder(AssetManager assetManager, String path) {
            throw new RuntimeException("Stub!");
        }

        public android.graphics.Typeface.Builder setWeight(int weight) {
            throw new RuntimeException("Stub!");
        }

        public android.graphics.Typeface.Builder setItalic(boolean italic) {
            throw new RuntimeException("Stub!");
        }

        public android.graphics.Typeface.Builder setTtcIndex(int ttcIndex) {
            throw new RuntimeException("Stub!");
        }

        public android.graphics.Typeface.Builder setFontVariationSettings(String variationSettings) {
            throw new RuntimeException("Stub!");
        }

        public android.graphics.Typeface.Builder setFontVariationSettings(FontVariationAxis[] axes) {
            throw new RuntimeException("Stub!");
        }

        public android.graphics.Typeface.Builder setFallback(String familyName) {
            throw new RuntimeException("Stub!");
        }

        public android.graphics.Typeface build() {
            throw new RuntimeException("Stub!");
        }
    }
}
