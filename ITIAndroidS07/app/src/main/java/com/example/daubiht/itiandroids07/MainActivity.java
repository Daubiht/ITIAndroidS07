package com.example.daubiht.itiandroids07;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hw = (TextView)findViewById(R.id.tv_hello_world);
        String now = DateUtils.formatDateTime(getApplicationContext(), (new Date()).getTime(), DateFormat.FULL);
        tv_hw.setText(now);
    }

    public void Clicked(View v) {
        Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_LONG).show();
    }

    public void notification_test() {

    }
}
