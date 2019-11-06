package sri.harsha.ramini.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Channel on 29-06-2018.
 */

public class HotelsAdapter extends ArrayAdapter<HotelsListItem>
{
    HotelsAdapter(Activity context, ArrayList<HotelsListItem> list)
    {
        super(context,0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.hotels_list_item,parent,false);
        }

        final HotelsListItem hotelsListItem=getItem(position);

        TextView name=(TextView)listItemView.findViewById(R.id.name);
        name.setText(hotelsListItem.getHotelName());

        TextView star=(TextView)listItemView.findViewById(R.id.star);
        star.setText(hotelsListItem.getStar());

        ImageView picture=(ImageView)listItemView.findViewById(R.id.picture);
        picture.setImageResource(hotelsListItem.getImageResourceId());

        Button call=(Button)listItemView.findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse(hotelsListItem.getNumber()));
                if(i.resolveActivity(getContext().getPackageManager())!=null)
                {
                    getContext().startActivity(i);
                }
            }
        });

        Button location=(Button)listItemView.findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse(hotelsListItem.getLocation()));
                if(i.resolveActivity(getContext().getPackageManager())!=null)
                {
                    getContext().startActivity(i);
                }
            }
        });

        /*int category=HotelsActivity.star;
        if(category>0)
        {
            int hotel_star=hotelsListItem.getHotelStar();
            if(hotel_star!=category)
                return null;
            else
                return listItemView;
        }
        else
        {
            if (!HotelsActivity.display[position])
                return null;
            else
                return listItemView;
        }*/
        return listItemView;
    }
}
