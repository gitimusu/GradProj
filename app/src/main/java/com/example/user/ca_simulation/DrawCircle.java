// Created by user on 2017-04-08.

package com.example.user.ca_simulation;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawCircle extends View{
    private Paint paint;
    public DrawCircle(Context context) {
        super(context);

        // create the Paint and set its color
        paint = new Paint();
        paint.setColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.DKGRAY);
        canvas.drawCircle(200, 200, 100, paint);
        canvas.drawCircle(600, 200, 100, paint);
        canvas.drawCircle(200, 600, 100, paint);
        canvas.drawCircle(600, 600, 100, paint);
        canvas.drawRect(100, 800, 300, 900, paint);
        canvas.drawRect(500, 800, 700, 900, paint);
        //canvas.drawRect(300, 900, 600, 1000, paint);
        //canvas.drawRect(600, 1400, 900, 1300, paint);
    }
}
