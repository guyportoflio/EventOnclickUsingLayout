package com.example.presly.eventonclickusinglayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void doSmall(View view) {
        //find textview
        TextView txtView = (TextView)findViewById(R.id.text_id);
        txtView.setTextSize(14);
    }

    public void doLarge(View view) {
        //find textview
        TextView txtView = (TextView)findViewById(R.id.text_id);
        txtView.setTextSize(24);
        return;
    }
}