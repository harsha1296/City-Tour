package sri.harsha.ramini.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MiscFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        ArrayList<LanguageListItem> misc=new ArrayList<LanguageListItem>();

        misc.add(new LanguageListItem("up","paina",R.raw.misc_up_male,R.raw.misc_up_male_slow,
                R.raw.misc_up_female,R.raw.misc_up_female_slow));
        misc.add(new LanguageListItem("down","kindha",R.raw.misc_down_male,R.raw.phrase_sit_down_male_slow,
                R.raw.misc_down_female,R.raw.misc_down_female_slow));
        misc.add(new LanguageListItem("you","nuvvu",R.raw.misc_you_male,R.raw.misc_you_male_slow,
                R.raw.misc_you_female,R.raw.misc_you_female_slow));
        misc.add(new LanguageListItem("me","nenu",R.raw.misc_me_male,R.raw.misc_me_male_slow,
                R.raw.misc_me_female,R.raw.misc_me_female_slow));
        misc.add(new LanguageListItem("they","vallu",R.raw.misc_they_male,R.raw.misc_they_male_slow,
                R.raw.misc_they_female,R.raw.misc_they_female_slow));
        misc.add(new LanguageListItem("we","manam",R.raw.misc_we_male,R.raw.misc_we_male_slow,
                R.raw.misc_we_female,R.raw.misc_we_female_slow));
        misc.add(new LanguageListItem("it","adhi",R.raw.misc_it_male,R.raw.misc_it_male_slow,
                R.raw.misc_it_female,R.raw.misc_it_female_slow));
        misc.add(new LanguageListItem("slowly","nemmadhiga",R.raw.misc_slowly_male,R.raw.misc_slowly_male_slow,
                R.raw.misc_slowly_female,R.raw.misc_slowly_female_slow));
        misc.add(new LanguageListItem("fast","twaraga",R.raw.misc_fast_male,R.raw.misc_fast_male_slow,
                R.raw.misc_fast_female,R.raw.misc_fast_female_slow));
        misc.add(new LanguageListItem("yes","avunu",R.raw.misc_yes_male,R.raw.misc_yes_male_slow,
                R.raw.misc_yes_female,R.raw.misc_yes_female_slow));
        misc.add(new LanguageListItem("no","kaadhu",R.raw.misc_no_male,R.raw.misc_no_male_slow,
                R.raw.misc_no_female,R.raw.misc_no_female_slow));
        misc.add(new LanguageListItem("there","akkada",R.raw.misc_there_male,R.raw.misc_there_male_slow,
                R.raw.misc_there_female,R.raw.misc_there_female_slow));

        View v=inflater.inflate(R.layout.fragment_misc, container, false);

        ListView listView=(ListView)v.findViewById(R.id.list);

        MyAdapter adapter=new MyAdapter(getActivity(),misc,R.color.language_misc);

        listView.setAdapter(adapter);

        return v;
    }
}
