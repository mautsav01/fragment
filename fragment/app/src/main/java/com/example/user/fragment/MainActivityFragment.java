package com.example.user.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v4.app.Fragment;

public class MainActivityFragment extends AppCompatActivity implements topfragment.TopActionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);
    }
    @Override
    public  void creatememe(String top, String bottom) {
        Buttomfragment bf= (Buttomfragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bf.setmeme(top,bottom);

    }
}
