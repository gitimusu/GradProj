package com.example.user.ca_simulation;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
  Created by user on 2017-07-01.
 */

public class CafeTableView extends View{
    private Rect rect1, rect2;
    private Paint paint;

    public CafeTableView(Context context){
        super(context);
        int x = 80;
        int y = 80;
        int sideLength = 300;

        // create a rectangle that we'll draw later
        rect1 = new Rect(x, y, sideLength, sideLength);
        rect2 = new Rect(80, 200, 500, 500);

        // create the Paint and set its color
        paint = new Paint();
        paint.setColor(Color.GRAY);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawColor(Color.WHITE);
        canvas.drawRect(rect1, paint);
        canvas.drawRect(rect2, paint);

    }

}
