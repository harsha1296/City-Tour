package sri.harsha.ramini.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    private static int x=0,y=0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.hotels_activity_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.scroll_to_top)
        {
            ListView listView=(ListView)findViewById(R.id.list);
            listView.smoothScrollToPosition(0);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<HotelsListItem> hotelsListItems=new ArrayList<HotelsListItem>();
        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.minerva_grand),"4",
                R.drawable.minerva,getResources().getString(R.string.minerva_grand_number),
                getResources().getString(R.string.minerva_grand_location),new int[]{1,1,0,0,0,1,1,1,0,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.dv_manor),"4",
                R.drawable.dvmanor,getResources().getString(R.string.dv_manor_number),
                getResources().getString(R.string.dv_manor_location),new int[]{1,1,0,0,0,1,1,1,0,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.gateway),"4",
                R.drawable.gateway,getResources().getString(R.string.gateway_number),
                getResources().getString(R.string.gateway_location),new int[]{1,1,0,0,0,1,1,1,0,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.fortune_murali),"4",
                R.drawable.fortune,getResources().getString(R.string.fortune_murali_number),
                getResources().getString(R.string.fortune_murali_location),new int[]{1,1,0,0,0,1,1,1,0,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.kay),"3",
                R.drawable.kay,getResources().getString(R.string.kay_number),
                getResources().getString(R.string.kay_location),new int[]{1,1,1,0,0,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.innotel),"3",
                R.drawable.innotel,getResources().getString(R.string.innotel_number),
                getResources().getString(R.string.innotel_location),new int[]{1,0,1,0,0,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.marg_krishnaaya),"4",
                R.drawable.marg,getResources().getString(R.string.marg_krishnaaya_number),
                getResources().getString(R.string.marg_krishnaaya_location),new int[]{1,0,0,0,0,1,1,1,0,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.ilapuram),"3",
                R.drawable.ilapuram,getResources().getString(R.string.ilapuram_number),
                getResources().getString(R.string.ilapuram_location),new int[]{1,1,0,1,0,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.continental_park),"3",
                R.drawable.continental,getResources().getString(R.string.continental_park_number),
                getResources().getString(R.string.continental_park_location),new int[]{1,0,0,1,0,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.southern_grand),"3",
                R.drawable.southern,getResources().getString(R.string.southern_grand_number),
                getResources().getString(R.string.southern_grand_location),new int[]{1,0,0,1,0,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.alankar_inn),"3",
                R.drawable.alankar_inn,getResources().getString(R.string.alankar_inn_number),
                getResources().getString(R.string.alankar_inn_location),new int[]{1,0,0,1,0,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.manorama),"3",
                R.drawable.manorama,getResources().getString(R.string.manorama_number),
                getResources().getString(R.string.manorama_location),new int[]{1,1,0,1,1,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.swarna_palace),"3",
                R.drawable.swarna_palace,getResources().getString(R.string.swarna_palace_number),
                getResources().getString(R.string.swarna_palace_location),new int[]{1,0,0,1,1,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.krishna_residency),"1",
                R.drawable.krishna_residency,getResources().getString(R.string.krishna_residency_number),
                getResources().getString(R.string.krishna_residency_location),new int[]{1,0,0,1,1,0,1,0,0,0,1}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.raj_towers),"4",
                R.drawable.raj_towers,getResources().getString(R.string.raj_towers_number),
                getResources().getString(R.string.raj_towers_location),new int[]{1,0,0,1,1,0,1,1,0,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.kosala),"2",
                R.drawable.kosala,getResources().getString(R.string.kosala_number),
                getResources().getString(R.string.kosala_location),new int[]{1,0,0,1,1,0,1,0,0,1,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.suncity),"3",
                R.drawable.suncity,getResources().getString(R.string.suncity_number),
                getResources().getString(R.string.suncity_location),new int[]{1,0,0,0,0,0,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.gsquare),"2",
                R.drawable.gsquare,getResources().getString(R.string.gsquare_number),
                getResources().getString(R.string.gsquare_location),new int[]{1,0,0,0,0,0,1,0,0,1,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.vasanth_marg),"3",
                R.drawable.vasanth_marg,getResources().getString(R.string.vasanth_marg_number),
                getResources().getString(R.string.vasanth_marg_location),new int[]{1,0,0,0,0,1,1,0,1,0,0}));

        hotelsListItems.add(new HotelsListItem(getResources().getString(R.string.golden_palace),"1",
                R.drawable.golden_palace,getResources().getString(R.string.golden_palace_number),
                getResources().getString(R.string.golden_palace_location),new int[]{1,0,0,1,1,0,1,0,0,0,1}));

        final TextView no_results_found=(TextView)findViewById(R.id.no_results_found);

        final HotelsAdapter adapter=new HotelsAdapter(HotelsActivity.this,hotelsListItems);

        final ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

        Spinner spinner_one=(Spinner)findViewById(R.id.spinner_one);
        Spinner spinner_two=(Spinner)findViewById(R.id.spinner_two);

        spinner_one.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                if(pos==0)x=6;
                if(pos==1)x=7;
                if(pos==2)x=8;
                if(pos==3)x=9;
                if(pos==4)x=10;

                ArrayList<HotelsListItem> duplicate=new ArrayList<HotelsListItem>();

                int k=0;
                for(int i=0;i<20;i++)
                {
                    HotelsListItem temp=hotelsListItems.get(i);
                    int[] array=temp.getHotelType();
                    if(array[x]==1 && array[y]==1)
                        duplicate.add(k++,temp);
                }
                if(k==0)
                {
                    listView.setVisibility(View.GONE);
                    no_results_found.setVisibility(View.VISIBLE);
                }
                else
                {
                    listView.setVisibility(View.VISIBLE);
                    no_results_found.setVisibility(View.GONE);
                    HotelsAdapter adapter=new HotelsAdapter(HotelsActivity.this,duplicate);
                    listView.setAdapter(null);
                    listView.setAdapter(adapter);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner_two.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                if(pos==0)y=0;
                if(pos==1)y=1;
                if(pos==2)y=2;
                if(pos==3)y=3;
                if(pos==4)y=4;
                if(pos==5)y=5;
                ArrayList<HotelsListItem> duplicate=new ArrayList<HotelsListItem>();

                int k=0;
                for(int i=0;i<20;i++)
                {
                    HotelsListItem temp=hotelsListItems.get(i);
                    int[] array=temp.getHotelType();
                    if(array[x]==1 && array[y]==1)
                        duplicate.add(k++,temp);
                }

                if(k==0)
                {
                    listView.setVisibility(View.GONE);
                    no_results_found.setVisibility(View.VISIBLE);
                }
                else
                {
                    listView.setVisibility(View.VISIBLE);
                    no_results_found.setVisibility(View.GONE);
                    HotelsAdapter adapter=new HotelsAdapter(HotelsActivity.this,duplicate);
                    listView.setAdapter(null);
                    listView.setAdapter(adapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
