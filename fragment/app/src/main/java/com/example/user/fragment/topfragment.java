package com.example.user.fragment;

import android.app.Activity;
//import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.Fragment;
/**
 * Created by USER on 3/9/2017.
 */

public class topfragment extends Fragment {


    TopActionListener activityCommander;
public interface TopActionListener{

    public void creatememe(String top,String botom);
}

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        activityCommander=(TopActionListener)activity;
    }

    public EditText top,buttom;
    Button bn;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top,container,false);
        top=(EditText)view.findViewById(R.id.edit1);
        buttom=(EditText)view.findViewById(R.id.edit2);

        bn=(Button)view.findViewById(R.id.button);
        bn.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
              buttonclicked();
            }
        });





        return view;

    }
    public void buttonclicked(){
activityCommander.creatememe(top.getText().toString(),buttom.getText().toString());
    }

}
