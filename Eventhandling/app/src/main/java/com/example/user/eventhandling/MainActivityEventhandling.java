package com.example.user.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityEventhandling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  final TextView txt=new TextView(this);


        super.onCreate(savedInstanceState);

        //setContentView joins your xml design(activity_main_eventhandling) design with java code:
        setContentView(R.layout.activity_main_eventhandling);
         final Button bt=(Button)findViewById(R.id.button1);
        bt.setOnClickListener(
                new Button.OnClickListener(){
            public  void onClick(View v){

                TextView txt=(TextView)findViewById(R.id.txt);
                EditText txt1=(EditText)findViewById(R.id.emailtxtid);
                String text1=txt1.getText().toString();
                EditText pas1=(EditText)findViewById(R.id.passtxt1);
                String password1=pas1.getText().toString();
                if(text1.equals("utsav") && password1.equals("utsav")){
                    txt.setText("Good job");
                }else{
                    txt.setText("incorrect!!");
                }

                
            }
        }

);

            }
}
