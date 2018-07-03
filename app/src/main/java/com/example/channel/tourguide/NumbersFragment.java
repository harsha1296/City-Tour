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
public class NumbersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {

        ArrayList<LanguageListItem> numbers=new ArrayList<LanguageListItem>();

        numbers.add(new LanguageListItem("one","okati",R.raw.number_one_male,R.raw.number_one_male_slow,
                                            R.raw.number_one_female,R.raw.number_one_female_slow));
        numbers.add(new LanguageListItem("two","rendu",R.raw.number_two_male,R.raw.number_two_male_slow,
                R.raw.number_two_female,R.raw.number_two_female_slow));
        numbers.add(new LanguageListItem("three","moodu",R.raw.number_three_male,R.raw.number_three_male_slow,
                R.raw.number_three_female,R.raw.number_three_female_slow));
        numbers.add(new LanguageListItem("four","naalugu",R.raw.number_four_male,R.raw.number_four_male_slow,
                R.raw.number_four_female,R.raw.number_four_female_slow));
        numbers.add(new LanguageListItem("five","aidhu",R.raw.number_five_male,R.raw.number_five_male_slow,
                R.raw.number_five_female,R.raw.number_five_female_slow));
        numbers.add(new LanguageListItem("six","aaru",R.raw.number_six_male,R.raw.number_six_male_slow,
                R.raw.number_six_female,R.raw.number_six_female_slow));
        numbers.add(new LanguageListItem("seven","eedu",R.raw.number_seven_male,R.raw.number_seven_male_slow,
                R.raw.number_seven_female,R.raw.number_seven_female_slow));
        numbers.add(new LanguageListItem("eight","enimidhi",R.raw.number_eight_male,R.raw.number_eight_male_slow,
                R.raw.number_eight_female,R.raw.number_eight_female_slow));
        numbers.add(new LanguageListItem("nine","thommidhi",R.raw.number_nine_male,R.raw.number_nine_male_slow,
                R.raw.number_nine_female,R.raw.number_nine_female_slow));
        numbers.add(new LanguageListItem("ten","padhi",R.raw.number_ten_male,R.raw.number_ten_male_slow,
                R.raw.number_ten_female,R.raw.number_ten_female_slow));
        numbers.add(new LanguageListItem("fifty","yabai",R.raw.number_fifty_male,R.raw.number_fifty_male_slow,
                R.raw.number_fifty_female,R.raw.number_fifty_female_slow));
        numbers.add(new LanguageListItem("hundred","vandha",R.raw.number_hundred_male,R.raw.number_hundred_male_slow,
                R.raw.number_hundred_female,R.raw.number_hundred_female_slow));
        numbers.add(new LanguageListItem("five hundred","aidhu vandhalu",R.raw.number_five_hundred_male,R.raw.number_five_hundred_male_slow,
                R.raw.number_five_hundred_female,R.raw.number_five_hundred_female_slow));
        numbers.add(new LanguageListItem("thousand","veyyi",R.raw.number_thousand_male,R.raw.number_thousand_male_slow,
                R.raw.number_thousand_female,R.raw.number_thousand_female_slow));


        View v=inflater.inflate(R.layout.fragment_numbers, container, false);

        ListView listView=(ListView)v.findViewById(R.id.list);

        MyAdapter adapter=new MyAdapter(getActivity(),numbers,R.color.language_numbers);

        listView.setAdapter(adapter);

        return v;
    }

}
