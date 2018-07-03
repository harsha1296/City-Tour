package com.example.channel.tourguide;


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
public class QuestionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        ArrayList<LanguageListItem> questions=new ArrayList<LanguageListItem>();

        questions.add(new LanguageListItem("what is your name","nee peerenti",R.raw.question_what_is_your_name_male,
                R.raw.question_what_is_your_name_male_slow,R.raw.question_what_is_your_name_female,R.raw.question_what_is_your_name_female_slow));
        questions.add(new LanguageListItem("where are you going","ekkadiki velthunnav",R.raw.question_where_are_you_going_male,
                R.raw.question_where_are_you_going_male_slow,R.raw.question_where_are_you_going_female,R.raw.question_where_are_you_going_female_slow));
        questions.add(new LanguageListItem("what is this","idhi emiti",R.raw.question_what_is_this_male,
                R.raw.question_what_is_this_male_slow,R.raw.question_what_is_this_female,R.raw.question_what_is_this_female_slow));
        questions.add(new LanguageListItem("do you speak english","meeru english maatladathara",R.raw.question_do_you_speak_english_male,
                R.raw.question_do_you_speak_english_male_slow,R.raw.question_do_you_speak_english_female,R.raw.question_do_you_speak_english_female_slow));
        questions.add(new LanguageListItem("who are you","evaru nuvvu",R.raw.question_who_are_you_male,
                R.raw.question_who_are_you_male_slow,R.raw.question_who_are_you_female,R.raw.question_who_are_you_female_slow));
        questions.add(new LanguageListItem("how old are you","nee vayasu entha",R.raw.question_how_old_are_you_male,
                R.raw.question_how_old_are_you_male_slow,R.raw.question_how_old_are_you_female,R.raw.question_how_old_are_you_female_slow));
        questions.add(new LanguageListItem("where are we","ekkada vunnam",R.raw.question_where_are_we_male,
                R.raw.question_where_are_we_male_slow,R.raw.question_where_are_we_female,R.raw.question_where_are_we_female_slow));
        questions.add(new LanguageListItem("what are you doing","em chesthunnav",R.raw.question_what_are_you_doing_male,
                R.raw.question_what_are_you_doing_male_slow,R.raw.question_what_are_you_doing_female,R.raw.question_what_are_you_doing_female_slow));
        questions.add(new LanguageListItem("where is your house","mee illu ekkada",R.raw.question_where_is_your_house_male,
                R.raw.question_where_is_your_house_male_slow,R.raw.question_where_is_your_house_female,R.raw.question_where_is_your_house_female_slow));
        questions.add(new LanguageListItem("what's the time","nee time entha",R.raw.question_whats_the_time_male,
                R.raw.question_whats_the_time_male_slow,R.raw.question_whats_the_time_female,R.raw.question_whats_the_time_female_slow));
        questions.add(new LanguageListItem("what's the cost of this","dheeni cost entha",R.raw.question_whats_the_cost_of_this_male,
                R.raw.question_whats_the_cost_of_this_male_slow,R.raw.question_whats_the_cost_of_this_female,R.raw.question_whats_the_cost_of_this_female_slow));

        View v=inflater.inflate(R.layout.fragment_questions, container, false);

        ListView listView=(ListView)v.findViewById(R.id.list);

        MyAdapter adapter=new MyAdapter(getActivity(),questions,R.color.language_questions);

        listView.setAdapter(adapter);

        return v;
    }

}
