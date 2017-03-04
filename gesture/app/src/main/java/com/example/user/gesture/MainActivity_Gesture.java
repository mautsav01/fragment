package com.example.user.gesture;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public  class MainActivity_Gesture extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{
    private TextView message;
    private GestureDetectorCompat gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__gesture);

        message=(TextView)findViewById(R.id.textView);
        String txt1=message.getText().toString();

        this.gestureDetector=new GestureDetectorCompat(this,this);





    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        message.setText("singleetap");
        return true;

    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        message.setText("ondoubletap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        message.setText("ondoubletap");
        return true;

    }

    @Override
    public boolean onDown(MotionEvent e) {
        message.setText("ondown");
        return true;

    }

    @Override
    public void onShowPress(MotionEvent e) {
        message.setText("onpress");
        //return true;

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        message.setText("onsingletap");
        return true;

    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        message.setText("onscroll");
        return true;

    }

    @Override
    public void onLongPress(MotionEvent e) {
        message.setText("onlongpress");
       // return true;

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        message.setText("onfling");
        return true;

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
