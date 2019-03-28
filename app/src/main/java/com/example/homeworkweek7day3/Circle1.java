package com.example.homeworkweek7day3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Circle1 extends View {
    int radius;
    int fillColor;
    int posX;
    int posY;


    public Circle1(Context context) {
        this(context, null);
    }

    public Circle1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Circle1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Circle);
        radius = typedArray.getInt(R.styleable.Circle_radius, 30);
        fillColor = typedArray.getColor(R.styleable.Circle_fillColor, 0);
        posX = typedArray.getInt(R.styleable.Circle_positionX, 50);
        posY = typedArray.getInt(R.styleable.Circle_positionY, 50);
        typedArray.recycle();
    }

    public Circle1(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, null, 0, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
