package sri.harsha.ramini.tourguide;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Channel on 02-07-2018.
 */

public class MyAdapter extends ArrayAdapter<LanguageListItem>
{
    static private MediaPlayer mediaPlayer;

    static private AudioManager audioManager;

    private int colorResourceId;

    static private AudioManager.OnAudioFocusChangeListener ob=new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange)
        {
            if(focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT)
            {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }
            else if(focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)
            {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }
            else if(focusChange==AudioManager.AUDIOFOCUS_LOSS)
            {
                releaseMediaPlayer();
            }
            else if(focusChange==AudioManager.AUDIOFOCUS_GAIN)
            {
                mediaPlayer.start();
            }
        }
    };

    MyAdapter(Activity context, ArrayList<LanguageListItem> list,int colorResourceId)
    {
        super(context,0,list);
        this.colorResourceId=colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.language_list_item,parent,false);
        }

        final LanguageListItem languageListItem=getItem(position);

        TextView english=(TextView)listItemView.findViewById(R.id.english);
        english.setText(languageListItem.getEnglishTranslation());

        TextView telugu=(TextView)listItemView.findViewById(R.id.telugu);
        telugu.setText(languageListItem.getTeluguTranslation());

        ImageView fast=(ImageView)listItemView.findViewById(R.id.fast);
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                releaseMediaPlayer();

                audioManager=(AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);

                int status=audioManager.requestAudioFocus(ob,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if(status==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                {
                    if(LanguageActivity.gender)
                        mediaPlayer=MediaPlayer.create(getContext(),languageListItem.getAudioResourceIdMaleFast());
                    else
                        mediaPlayer=MediaPlayer.create(getContext(),languageListItem.getAudioResourceIdFemaleFast());

                    mediaPlayer.start();

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            releaseMediaPlayer();
                        }
                    });

                }


            }
        });

        ImageView slow=(ImageView)listItemView.findViewById(R.id.slow);
        slow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                releaseMediaPlayer();

                audioManager=(AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
                int status=audioManager.requestAudioFocus(ob,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if(status==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                {
                    if(LanguageActivity.gender)
                        mediaPlayer=MediaPlayer.create(getContext(),languageListItem.getAudioResourceIdMaleSlow());
                    else
                        mediaPlayer=MediaPlayer.create(getContext(),languageListItem.getAudioResourceIdFemaleSlow());

                    mediaPlayer.start();

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {

                            releaseMediaPlayer();

                        }
                    });
                }

            }
        });

        LinearLayout linearLayout=(LinearLayout)listItemView.findViewById(R.id.linearLayout);
        linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(),colorResourceId));


        return listItemView;
    }

    static void releaseMediaPlayer()
    {
        if(mediaPlayer!=null)
        {
            mediaPlayer.release();
            mediaPlayer=null;
            audioManager.abandonAudioFocus(ob);
        }
    }


}


