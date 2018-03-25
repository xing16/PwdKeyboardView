package com.xing.pwdkeyboardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pay(View view) {
        PayDialogFragment payDialogFragment = new PayDialogFragment();
        payDialogFragment.show(getSupportFragmentManager(), "payFragment");
    }
}
