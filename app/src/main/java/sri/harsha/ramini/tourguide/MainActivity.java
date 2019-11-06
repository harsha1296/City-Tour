package sri.harsha.ramini.tourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.about:
                Intent i=new Intent(MainActivity.this,About.class);
                startActivity(i);
                break;
            case R.id.share:
                Intent ii=new Intent();
                ii.setAction(Intent.ACTION_SEND);
                ii.setType("text/plain");
                String s="https://play.google.com/store/apps/details?id=sri.harsha.ramini.tourguide&rdid=sri.harsha.ramini.tourguide";
                ii.putExtra(Intent.EXTRA_TEXT,s);
                if(ii.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(ii);
                }
                //Toast.makeText(MainActivity.this,"Share option yet to be implemented",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView top_spots=(TextView)findViewById(R.id.top_spots);
        top_spots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,TopSpots.class);
                startActivity(i);
            }
        });


        TextView hotels=(TextView)findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,HotelsActivity.class);
                startActivity(i);
            }
        });


        TextView thingstodo=(TextView)findViewById(R.id.things_to_do);
        thingstodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ThingsToDo.class);
                startActivity(i);
            }
        });


        TextView language=(TextView)findViewById(R.id.language);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,LanguageActivity.class);
                startActivity(i);
            }
        });

    }

}
