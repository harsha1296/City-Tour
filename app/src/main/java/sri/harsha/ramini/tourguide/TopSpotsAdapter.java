package sri.harsha.ramini.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Channel on 28-06-2018.
 */

public class TopSpotsAdapter extends ArrayAdapter<TopSpotsListItem>
{
    TopSpotsAdapter(Activity context, ArrayList<TopSpotsListItem> list)
    {
        super(context,0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;

        if(listItemView==null)
        {
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.top_spots_list_item,parent,false);
        }

        TopSpotsListItem listItem=getItem(position);

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(listItem.getImageResourceId());

        TextView textView=(TextView)listItemView.findViewById(R.id.text);
        textView.setText(listItem.getPlace());


        return listItemView;

    }
}
