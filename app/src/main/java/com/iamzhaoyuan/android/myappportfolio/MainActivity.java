package com.iamzhaoyuan.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOAST_PREFIX = "This button will launch my ";
    private static final String TOAST_POSTFIX = " app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void openTheApp(View view) {
        String appName = ((Button)view).getText().toString().toLowerCase();
        Toast.makeText(getApplicationContext(),
                       TOAST_PREFIX + appName + TOAST_POSTFIX,
                       Toast.LENGTH_LONG).show();
    }
}
