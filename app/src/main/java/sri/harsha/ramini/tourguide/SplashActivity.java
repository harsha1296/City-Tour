package sri.harsha.ramini.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent i=new Intent(SplashActivity.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
