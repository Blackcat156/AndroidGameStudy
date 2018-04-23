package com.example.cat.gametest.Utils;

import android.graphics.Bitmap;

import java.security.Principal;

/**
 * Created by cat on 2018/4/23.
 */

public class ImagePiece {
    @Override
    public String toString() {
        return "ImagePiece{" +
                "index=" + index +
                ", bitmap=" + bitmap +
                '}';
    }

    public ImagePiece(int index) {
        this.index = index;
    }

    public ImagePiece() {
    }

    private  int index;
    private Bitmap bitmap;

    public int getIndex() {
        return index;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }


    public void setIndex(int index) {
        this.index = index;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }


    public ImagePiece(int index, Bitmap bitmap) {
        this.index = index;
        this.bitmap = bitmap;
    }
}
