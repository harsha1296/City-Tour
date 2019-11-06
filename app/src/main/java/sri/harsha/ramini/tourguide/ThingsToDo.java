package sri.harsha.ramini.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;

public class ThingsToDo extends AppCompatActivity {

    boolean anything;
    boolean[] open=new boolean[8];

    TextView malls;
    TextView cinemas;
    TextView restaurants;
    TextView icecreams;
    TextView sweets;
    TextView others;
    TextView parks;
    TextView shopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        malls=(TextView)findViewById(R.id.malls);
        cinemas=(TextView)findViewById(R.id.cinemas);
        restaurants=(TextView)findViewById(R.id.restaurants);
        icecreams=(TextView)findViewById(R.id.icecreams);
        sweets=(TextView)findViewById(R.id.sweets);
        others=(TextView)findViewById(R.id.others);
        parks=(TextView)findViewById(R.id.parks);
        shopping=(TextView)findViewById(R.id.shopping);

        SpannableString string = new SpannableString(getResources().getString(R.string.malls));
        string.setSpan(new AbsoluteSizeSpan(26, true), 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        malls.setText(string);

        string=new SpannableString(getResources().getString(R.string.cinemas));
        string.setSpan(new AbsoluteSizeSpan(26,true),0,7,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        cinemas.setText(string);

        string=new SpannableString(getResources().getString(R.string.restaurants));
        string.setSpan(new AbsoluteSizeSpan(26,true),0,11,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        restaurants.setText(string);

        string=new SpannableString(getResources().getString(R.string.icecreams));
        string.setSpan(new AbsoluteSizeSpan(26,true),0,18,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        icecreams.setText(string);

        string=new SpannableString(getResources().getString(R.string.sweets));
        string.setSpan(new AbsoluteSizeSpan(26,true),0,6,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sweets.setText(string);

        string=new SpannableString(getResources().getString(R.string.others));
        string.setSpan(new AbsoluteSizeSpan(26,true),0,25,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        others.setText(string);

        string=new SpannableString(getResources().getString(R.string.parks));
        string.setSpan(new AbsoluteSizeSpan(26,true),0,5,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        parks.setText(string);

        string=new SpannableString(getResources().getString(R.string.shopping));
        string.setSpan(new AbsoluteSizeSpan(26,true),0,8,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        shopping.setText(string);


        anything=false;
        for(int i=0;i<8;i++)
            open[i]=false;

        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    malls.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[0]=true;
                }
                else
                {
                    if(open[0])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        malls.setMaxLines(Integer.MAX_VALUE);
                        open[0]=true;
                    }

                }
            }
        });

        cinemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    cinemas.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[1]=true;
                }
                else
                {
                    if(open[1])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        cinemas.setMaxLines(Integer.MAX_VALUE);
                        open[1]=true;
                    }

                }
            }
        });

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    restaurants.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[2]=true;
                }
                else
                {
                    if(open[2])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        restaurants.setMaxLines(Integer.MAX_VALUE);
                        open[2]=true;
                    }

                }
            }
        });

        icecreams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    icecreams.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[3]=true;
                }
                else
                {
                    if(open[3])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        icecreams.setMaxLines(Integer.MAX_VALUE);
                        open[3]=true;
                    }

                }
            }
        });

        sweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    sweets.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[4]=true;
                }
                else
                {
                    if(open[4])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        sweets.setMaxLines(Integer.MAX_VALUE);
                        open[4]=true;
                    }

                }
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    others.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[5]=true;
                }
                else
                {
                    if(open[5])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        others.setMaxLines(Integer.MAX_VALUE);
                        open[5]=true;
                    }

                }
            }
        });

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    parks.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[6]=true;
                }
                else
                {
                    if(open[6])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        parks.setMaxLines(Integer.MAX_VALUE);
                        open[6]=true;
                    }

                }
            }
        });
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!anything)
                {
                    shopping.setMaxLines(Integer.MAX_VALUE);
                    anything=true;
                    open[7]=true;
                }
                else
                {
                    if(open[7])
                    {
                        closeAll();
                    }
                    else
                    {
                        closeAll();
                        shopping.setMaxLines(Integer.MAX_VALUE);
                        open[7]=true;
                    }

                }
            }
        });

    }

    void closeAll()
    {
        malls.setMaxLines(1);
        cinemas.setMaxLines(1);
        restaurants.setMaxLines(1);
        icecreams.setMaxLines(1);
        sweets.setMaxLines(1);
        others.setMaxLines(1);
        parks.setMaxLines(1);
        shopping.setMaxLines(1);
        for(int i=0;i<8;i++)
            open[i]=false;
    }

}
