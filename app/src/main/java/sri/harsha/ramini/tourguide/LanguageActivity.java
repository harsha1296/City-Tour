package sri.harsha.ramini.tourguide;

import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentManager;
//import android.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.design.widget.*;


public class LanguageActivity extends AppCompatActivity {

    static boolean gender=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(this.getResources().getColor(R.color.mycolor)));
        getSupportActionBar().setElevation(0);

        ViewPager pager=(ViewPager)findViewById(R.id.pager);

        FragmentManager fragmentManager=getSupportFragmentManager();

        MyPagerAdapter adapter=new MyPagerAdapter(fragmentManager);

        pager.setAdapter(adapter);

        //compile 'com.android.support:design:22.2.0'(add this in build.gradle(Module:app) dependencies for TabLayout to work
        TabLayout slider=(TabLayout)findViewById(R.id.slider);
        slider.setupWithViewPager(pager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.language_activity_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.male:
                gender=true;
                break;
            case R.id.female:
                gender=false;
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        MyAdapter.releaseMediaPlayer();
        super.onStop();
    }
}
