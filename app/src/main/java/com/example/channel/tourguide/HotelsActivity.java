package com.example.channel.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    static boolean[] display=new boolean[20];
    static int star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<HotelsListItem> hotelsListItems=new ArrayList<HotelsListItem>();
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

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.alankar_inn),"3",
                R.drawable.alankar_inn,getResources().getString(R.string.alankar_inn_number),
                getResources().getString(R.string.alankar_inn_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.manorama),"3",
                R.drawable.manorama,getResources().getString(R.string.manorama_number),
                getResources().getString(R.string.manorama_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.swarna_palace),"3",
                R.drawable.swarna_palace,getResources().getString(R.string.swarna_palace_number),
                getResources().getString(R.string.swarna_palace_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.krishna_residency),"1",
                R.drawable.krishna_residency,getResources().getString(R.string.krishna_residency_number),
                getResources().getString(R.string.krishna_residency_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.raj_towers),"4",
                R.drawable.raj_towers,getResources().getString(R.string.raj_towers_number),
                getResources().getString(R.string.raj_towers_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.kosala),"2",
                R.drawable.kosala,getResources().getString(R.string.kosala_number),
                getResources().getString(R.string.kosala_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.suncity),"3",
                R.drawable.suncity,getResources().getString(R.string.suncity_number),
                getResources().getString(R.string.suncity_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.gsquare),"2",
                R.drawable.gsquare,getResources().getString(R.string.gsquare_number),
                getResources().getString(R.string.gsquare_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.vasanth_marg),"3",
                R.drawable.vasanth_marg,getResources().getString(R.string.vasanth_marg_number),
                getResources().getString(R.string.vasanth_marg_location)));
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.golden_palace),"1",
                R.drawable.golden_palace,getResources().getString(R.string.golden_palace_number),
                getResources().getString(R.string.golden_palace_location)));

        for(int i=0;i<20;i++)
            display[i]=true;
        star=0;

        final HotelsAdapter adapter=new HotelsAdapter(HotelsActivity.this,hotelsListItems);

        final ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

        Spinner spinner=(Spinner)findViewById(R.id.spinner);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

               ArrayList<HotelsListItem> duplicate=new ArrayList<HotelsListItem>();

               for(int i=0;i<20;i++)
                   display[i]=false;
               star=0;
               if(pos==0)
               {
                   for(int i=0;i<20;i++)
                       duplicate.add(i,hotelsListItems.get(i));
               }
               else if(pos==1)
               {
                   for(int i=0;i<5;i++)
                       duplicate.add(i,hotelsListItems.get(i));

                   duplicate.add(hotelsListItems.get(7));
                   duplicate.add(hotelsListItems.get(11));
                   //display[0]=display[1]=display[2]=display[3]=display[4]=display[7]=display[11]=true;
               }
               else if(pos==2)
               {
                   duplicate.add(hotelsListItems.get(4));
                   duplicate.add(hotelsListItems.get(5));
                   //display[4]=display[5]=true;
               }
               else if(pos==3)
               {
                   for(int i=7;i<16;i++)
                       duplicate.add(i-7,hotelsListItems.get(i));
                   duplicate.add(hotelsListItems.get(19));
                   //display[7]=display[8]=display[9]=display[10]=display[11]=display[12]=display[13]=display[14]=display[15]=display[19]=true;
               }
               else if(pos==4)
               {
                   for(int i=11;i<16;i++)
                       duplicate.add(i-11,hotelsListItems.get(i));
                   duplicate.add(hotelsListItems.get(19));
                   //display[11]=display[12]=display[13]=display[14]=display[15]=display[19]=true;
               }
               else if(pos==5)
               {
                   for(int i=0;i<4;i++)
                       duplicate.add(i,hotelsListItems.get(i));
                   duplicate.add(hotelsListItems.get(6));
                   duplicate.add(hotelsListItems.get(18));

                   //display[0]=display[1]=display[2]=display[3]=display[6]=display[18]=true;
               }
               else if(pos==6)
               {
                   for(int i=0;i<20;i++)
                   {
                       if(hotelsListItems.get(i).getHotelStar()==4)
                           duplicate.add(hotelsListItems.get(i));
                   }
               }
               else if(pos==7)
               {
                   for(int i=0;i<20;i++)
                   {
                       if(hotelsListItems.get(i).getHotelStar()==3)
                           duplicate.add(hotelsListItems.get(i));
                   }
               }
               else if(pos==8)
               {
                   for(int i=0;i<20;i++)
                   {
                       if(hotelsListItems.get(i).getHotelStar()==2)
                           duplicate.add(hotelsListItems.get(i));
                   }
               }
               else
               {
                   for(int i=0;i<20;i++)
                   {
                       if(hotelsListItems.get(i).getHotelStar()==1)
                           duplicate.add(hotelsListItems.get(i));
                   }
               }
               listView.setAdapter(null);
               HotelsAdapter duplicateAdapter=new HotelsAdapter(HotelsActivity.this,duplicate);
               listView.setAdapter(duplicateAdapter);
           }
           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });

    }
}
