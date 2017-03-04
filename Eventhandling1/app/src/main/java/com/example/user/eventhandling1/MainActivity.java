package com.example.user.eventhandling1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button button1=(Button)findViewById(R.id.button);
button1.setOnClickListener(
  new Button.OnClickListener(){
      public void onClick(View v){
          TextView txt=(TextView)findViewById(R.id.textView);
          txt.setText("Good job");
      }
  }

);
    }
}
