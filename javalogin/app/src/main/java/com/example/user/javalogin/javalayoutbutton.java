package com.example.user.javalogin;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;



public class javalayoutbutton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout rl=new RelativeLayout(this);
        Button bn=new Button(this);
        EditText txt=new EditText(this);

        bn.setId(1);
        txt.setId(2);

        rl.setBackgroundColor(Color.MAGENTA);
        bn.setBackgroundColor(Color.WHITE);
        bn.setText("login");
        bn.setTextColor(Color.BLACK);


        RelativeLayout.LayoutParams bndetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        bndetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        bndetails.addRule(RelativeLayout.CENTER_VERTICAL);


        RelativeLayout.LayoutParams txtdetails=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        txtdetails.addRule(RelativeLayout.ABOVE,bn.getId());
        txtdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txtdetails.setMargins(0,0,0,100);

        Resources rs=getResources();

         int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,rs.getDisplayMetrics());
            txt.setWidth(px);

        rl.addView(bn,bndetails);
        rl.addView(txt,txtdetails);
        setContentView(rl);

    }
}
