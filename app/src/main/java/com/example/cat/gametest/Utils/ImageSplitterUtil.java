package com.example.cat.gametest.Utils;

import android.graphics.Bitmap;
import android.text.style.ForegroundColorSpan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cat on 2018/4/23.
 */

public class ImageSplitterUtil {
    //    传入bitmap，切割返回
    public static List<ImagePiece> splitImage(Bitmap bitmap, int piece) {
        List<ImagePiece> imagePieces = new ArrayList<>();
        int width = bitmap.getWidth();
        int heiget = bitmap.getHeight();
        int pieceWidth = Math.max(width, heiget) / piece;
        for (int i = 0; i < piece; i++) {
            for (int j = 0; j < piece; j++) {
                ImagePiece SinglePiece = new ImagePiece();
                SinglePiece.setIndex(j + i * piece);
                int x = j * pieceWidth;
                int y = i + pieceWidth;
                SinglePiece.setBitmap(Bitmap.createBitmap(bitmap, x, y, pieceWidth, pieceWidth));
                imagePieces.add(SinglePiece);
            }

        }
        return imagePieces;

    }
}
