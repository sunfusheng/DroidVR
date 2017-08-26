package com.sunfusheng.vr.utils;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.widget.ImageView;

public class ImageUtil {

    @SuppressWarnings("deprecation")
    public static void colorImageViewDrawable(ImageView imageView, @ColorRes int id) {
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, new ColorStateList(new int[][]{new int[]{}}, new int[]{imageView.getContext().getResources().getColor(id)}));
            imageView.setImageDrawable(drawable);
        }
    }
}
