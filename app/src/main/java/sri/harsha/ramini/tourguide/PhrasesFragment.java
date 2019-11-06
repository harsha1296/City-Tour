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
public class PhrasesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        ArrayList<LanguageListItem> phrases=new ArrayList<LanguageListItem>();

        phrases.add(new LanguageListItem("come here","ikkadiki ra",R.raw.phrase_come_here_male,
                R.raw.phrase_come_here_male_slow,R.raw.phrase_come_here_female,R.raw.phrase_come_here_female_slow));
        phrases.add(new LanguageListItem("go there","akkadiki vellu",R.raw.phrase_go_there_male,
                R.raw.phrase_go_there_male_slow,R.raw.phrase_go_there_female,R.raw.phrase_go_there_female_slow));
        phrases.add(new LanguageListItem("look at me","nannu chudu",R.raw.phrase_look_at_me_male,
                R.raw.phrase_look_at_me_male_slow,R.raw.phrase_look_at_me_female,R.raw.phrase_look_at_me_female_slow));
        phrases.add(new LanguageListItem("take this","idhi theesko",R.raw.phrase_take_this_male,
                R.raw.phrase_take_this_male_slow,R.raw.phrase_take_this_female,R.raw.phrase_take_this_female_slow));
        phrases.add(new LanguageListItem("so what","aithe emiti",R.raw.phrase_so_what_male,
                R.raw.phrase_so_what_male_slow,R.raw.phrase_so_what_female,R.raw.phrase_so_what_female_slow));
        phrases.add(new LanguageListItem("call me","nannu pilu",R.raw.phrase_call_me_male,
                R.raw.phrase_call_me_male_slow,R.raw.phrase_call_me_female,R.raw.phrase_call_me_female_slow));
        phrases.add(new LanguageListItem("wait for a minute","okka nimisham aagu",R.raw.phrase_wait_for_a_minute_male,
                R.raw.phrase_wait_for_a_minute_male_slow,R.raw.phrase_wait_for_a_minute_female,R.raw.phrase_wait_for_a_minute_female_slow));
        phrases.add(new LanguageListItem("stand up","nilabadu",R.raw.phrase_stand_up_male,
                R.raw.phrase_stand_up_male_slow,R.raw.phrase_stand_up_female,R.raw.phrase_stand_up_female_slow));
        phrases.add(new LanguageListItem("sit down","koorcho",R.raw.phrase_sit_down_male,
                R.raw.phrase_sit_down_male_slow,R.raw.phrase_sit_down_female,R.raw.phrase_sit_down_female_slow));
        phrases.add(new LanguageListItem("not me","nenu kaadhu",R.raw.phrase_not_me_male,
                R.raw.number_one_male_slow,R.raw.number_one_female,R.raw.number_one_female_slow));
        phrases.add(new LanguageListItem("my name is...","naa peru...",R.raw.phrase_my_name_is_male,
                R.raw.phrase_my_name_is_male_slow,R.raw.phrase_my_name_is_female,R.raw.phrase_my_name_is_female_slow));
        phrases.add(new LanguageListItem("be careful","jaagrathhaga vundu",R.raw.phrase_be_careful_male,
                R.raw.phrase_be_careful_male_slow,R.raw.phrase_be_careful_female,R.raw.phrase_be_careful_female_slow));

        View v=inflater.inflate(R.layout.fragment_phrases, container, false);

        ListView listView=(ListView)v.findViewById(R.id.list);

        MyAdapter adapter=new MyAdapter(getActivity(),phrases,R.color.language_phrases);

        listView.setAdapter(adapter);

        return v;
    }

}
