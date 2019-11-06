package sri.harsha.ramini.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SpannableString s = new SpannableString(getResources().getString(R.string.about_developer));
        ClickableSpan ob1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"examplesricom1996@gmail.com"});
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        };

        ClickableSpan ob2 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + "+918639799620"));
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        };
        s.setSpan(ob1, 390, 420, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(ob2, 431, 444, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        TextView about_developer = (TextView) findViewById(R.id.about_developer);
        about_developer.setMovementMethod(LinkMovementMethod.getInstance());
        about_developer.setText(s);

    }
}
