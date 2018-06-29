package com.example.channel.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ArrayList<HotelsListItem> hotelsListItems=new ArrayList<HotelsListItem>();
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.minerva_grand),"4",
                R.drawable.minerva,getResources().getString(R.string.minerva_grand_number),
                getResources().getString(R.string.minerva_grand_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.dv_manor),"4",
                R.drawable.dvmanor,getResources().getString(R.string.dv_manor_number),
                getResources().getString(R.string.dv_manor_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.gateway),"4",
                R.drawable.gateway,getResources().getString(R.string.gateway_number),
                getResources().getString(R.string.gateway_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.fortune_murali),"4",
                R.drawable.fortune,getResources().getString(R.string.fortune_murali_number),
                getResources().getString(R.string.fortune_murali_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.kay),"3",
                R.drawable.kay,getResources().getString(R.string.kay_number),
                getResources().getString(R.string.kay_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.innotel),"3",
                R.drawable.innotel,getResources().getString(R.string.innotel_number),
                getResources().getString(R.string.innotel_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.marg_krishnaaya),"4",
                R.drawable.marg,getResources().getString(R.string.marg_krishnaaya_number),
                getResources().getString(R.string.marg_krishnaaya_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.ilapuram),"3",
                R.drawable.ilapuram,getResources().getString(R.string.ilapuram_number),
                getResources().getString(R.string.ilapuram_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.continental_park),"3",
                R.drawable.continental,getResources().getString(R.string.continental_park_number),
                getResources().getString(R.string.continental_park_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.southern_grand),"3",
                R.drawable.southern,getResources().getString(R.string.southern_grand_number),
                getResources().getString(R.string.southern_grand_location)));

        HotelsAdapter adapter=new HotelsAdapter(HotelsActivity.this,hotelsListItems);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
