package com.onurciner.oxswipe;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Onur.Ciner on 29.09.2016.
 */
public class OXSwipe implements View.OnTouchListener {

    private float x1, y1;
    private float x2, y2;

    private boolean oneTouchControl = false;

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            x1 = event.getX();
            y1 = event.getY();
        } else if (event.getAction() == MotionEvent.ACTION_UP) {

            x2 = event.getX();
            y2 = event.getY();

            if (x1 > x2 && y1 > y2) {
                float t = (x1 - x2) - (y1 - y2);
                if (t > 0){
                    leftSwipe();
                    oneTouchControl = true;
                }
            } else if (x1 > x2 && y2 > y1) {
                float t = (x1 - x2) - (y2 - y1);
                if (t > 0){
                    leftSwipe();
                    oneTouchControl = true;
                }
            }

            if (x2 > x1 && y1 > y2) {
                float t = (x2 - x1) - (y1 - y2);
                if (t > 0){
                    rightSwipe();
                    oneTouchControl = true;
                }
            } else if (x2 > x1 && y2 > y1) {
                float t = (x2 - x1) - (y2 - y1);
                if (t > 0){
                    rightSwipe();
                    oneTouchControl = true;
                }
            }

            if (y2 > y1 && x1 > x2) {
                float t = (y2 - y1) - (x1 - x2);
                if (t > 0) {
                    downSwipe();
                    oneTouchControl = true;
                }
            } else if (y2 > y1 && x2 > x1) {
                float t = (y2 - y1) - (x2 - x1);
                if (t > 0) {
                    downSwipe();
                    oneTouchControl = true;
                }
            }

            if (y1 > y2 && x1 > x2) {
                float t = (y1 - y2) - (x1 - x2);
                if (t > 0) {
                    upSwipe();
                    oneTouchControl = true;
                }
            } else if (y1 > y2 && x2 > x1) {
                float t = (y1 - y2) - (x2 - x1);
                if (t > 0) {
                    upSwipe();
                    oneTouchControl = true;
                }
            }

            if (!oneTouchControl){
                oneTouch();

            }else{
                oneTouchControl = false;
            }
        }
        return true;
    }

    // +----->
    public void leftSwipe() {
    }

    // <-----+
    public void rightSwipe() {
    }

    // ↑
    public void upSwipe() {
    }

    // ↓
    public void downSwipe() {
    }

    // +
    public void oneTouch() {
    }


    /** Usage
     *
     relativeLayout.setOnTouchListener(new OXSwipe(){
        @Override public void leftSwipe() {

        }

        @Override public void rightSwipe() {

        }

        @Override public void upSwipe() {

        }

        @Override public void downSwipe() {

        }
        @Override public void oneTouch() {

        }
    });
     */
}
