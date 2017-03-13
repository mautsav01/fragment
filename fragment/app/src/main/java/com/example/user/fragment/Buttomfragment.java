package com.example.user.fragment;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;
/**
 * Created by USER on 3/9/2017.
 */

public class Buttomfragment extends Fragment {
    public static TextView up,up3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttom, container, false);
        up = (TextView) view.findViewById(R.id.up1);
        up3 = (TextView) view.findViewById(R.id.up2);


        return view;
    }
        public static void setmeme(String top, String botom){
            up.setText(top);
            up3.setText(botom);
        }
    }

