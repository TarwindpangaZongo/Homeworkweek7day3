package com.example.homeworkweek7day3;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Circle0 extends View {
    int radius;
    int fillColor;
    int posX;
    int posY;

    public Circle0(Context context) {
        this(context, null);
    }

    public Circle0(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Circle0(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Circle0(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, null, 0, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
