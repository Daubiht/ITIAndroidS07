package com.example.daubiht.itiandroids07;

import android.app.DatePickerDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import android.support.v7.widget.RecyclerView;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listItems=new ArrayList<String>();

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hw = (TextView)findViewById(R.id.tv_hello_world);
        String now = DateUtils.formatDateTime(getApplicationContext(), (new Date()).getTime(), DateFormat.FULL);
        tv_hw.setText(now);

        RecyclerView rv = findViewById(R.id.rv_biere);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        BiersAdapter ba = new BiersAdapter(new JSONArray());
        rv.setAdapter(ba);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ListView listV = (ListView) findViewById(R.id.list);
        
        listV.addView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Y a pas de settings lol",Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_favorite:
                Intent homepage = new Intent(MainActivity.this, MainActivity.class);
                startActivity(homepage);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}