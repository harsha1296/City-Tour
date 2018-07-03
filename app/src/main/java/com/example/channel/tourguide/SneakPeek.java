package com.example.channel.tourguide;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SneakPeek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneak_peek);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            String temp1=extras.getString("temp1");
            int temp2=extras.getInt("temp2");
            String temp3=extras.getString("temp3");
            String activity_name=extras.getString("activity_name");

            ab.setTitle(activity_name);

            TextView heading=(TextView)findViewById(R.id.heading);
            heading.setText(temp1);

            ImageView picture=(ImageView)findViewById(R.id.picture);
            picture.setImageResource(temp2);

            TextView about=(TextView)findViewById(R.id.about);
            about.setText(temp3);
        }




    }
}
