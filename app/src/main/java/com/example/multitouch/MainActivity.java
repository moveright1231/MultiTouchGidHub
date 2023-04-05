package com.example.multitouch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

//Commit1 -- 기본설계완료
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MultiTouchView myView = new MultiTouchView(this);
        setContentView(myView);
    }

    class MultiTouchView extends View {
        private static final int SIZE = 60;
        final int MAX_POINT = 5;
        float[] x = new float[MAX_POINT];
        float[] y = new float[MAX_POINT];
        boolean[] touching = new boolean[MAX_POINT];
        private Paint mPaint;
        public MultiTouchView(Context context) {
            super(context);
            mPaint = new Paint();
            mPaint.setColor(Color.BLUE);
            mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int index = event.getActionIndex();
        int id = event.getPointerId(index);
        int action = event.getActionMasked();
        switch(action) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_POINTER_DOWN:
               // x[id] =
        }
        return super.onTouchEvent(event);
    }
}