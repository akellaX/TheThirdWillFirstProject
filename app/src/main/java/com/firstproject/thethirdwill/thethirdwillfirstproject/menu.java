package com.firstproject.thethirdwill.thethirdwillfirstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class menu extends AppCompatActivity {
    //declare widgets
    Button btn_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //init widgets
        btn_play = (Button) findViewById(R.id.btn_play);
    }

    public void btn_play_func()
    {
        Intent newIntent = new Intent(menu.this, question.class);
        startActivity(newIntent);
    }
}
