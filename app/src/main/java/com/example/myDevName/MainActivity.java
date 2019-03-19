package com.example.myDevName;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //creating the exception
            int x = 10, y = 0;
            x = x / y;
            if(BuildConfig.DEBUG)
                Log.e(savedInstanceState.getClass().getName(),"Division by 0?");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
