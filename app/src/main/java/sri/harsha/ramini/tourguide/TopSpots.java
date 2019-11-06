package sri.harsha.ramini.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TopSpots extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_spots);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final ArrayList<TopSpotsListItem> listItems = new ArrayList<TopSpotsListItem>();

        listItems.add(new TopSpotsListItem("Kanaka Durga Temple", R.drawable.temp, getResources().getString(R.string.kanaka_durga_temple_heading),
                getResources().getString(R.string.kanaka_durga_temple_description)));
        listItems.add(new TopSpotsListItem("Prakasam Barrage", R.drawable.prak, getResources().getString(R.string.prakasam_barrage_heading),
                getResources().getString(R.string.prakasam_barrage_description)));
        listItems.add(new TopSpotsListItem("Undavalli Caves", R.drawable.unda, getResources().getString(R.string.undavalli_caves_heading),
                getResources().getString(R.string.undavalli_caves_description)));
        listItems.add(new TopSpotsListItem("Bhavani Island", R.drawable.bhav, getResources().getString(R.string.bhavani_island_heading),
                getResources().getString(R.string.bhavani_island_description)));
        listItems.add(new TopSpotsListItem("Gandhi Hill", R.drawable.gandhi, getResources().getString(R.string.gandhi_hill_heading),
                getResources().getString(R.string.gandhi_hill_description)));
        listItems.add(new TopSpotsListItem("Rajiv Gandhi Park", R.drawable.rajiv, getResources().getString(R.string.rajiv_gandhi_park_heading),
                getResources().getString(R.string.rajiv_gandhi_park_description)));
        listItems.add(new TopSpotsListItem("Bapu Museum", R.drawable.bapu, getResources().getString(R.string.bapu_museum_heading),
                getResources().getString(R.string.bapu_museum_description)));

        TopSpotsAdapter adapter = new TopSpotsAdapter(this, listItems);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {

                TopSpotsListItem topSpotsListItem = listItems.get(pos);

                Intent i = new Intent(TopSpots.this, SneakPeek.class);
                i.putExtra("temp1", topSpotsListItem.getHeading());
                i.putExtra("temp2", topSpotsListItem.getImageResourceId());
                i.putExtra("temp3", topSpotsListItem.getDescription());
                i.putExtra("activity_name", topSpotsListItem.getPlace());

                startActivity(i);

            }
        });

    }
}