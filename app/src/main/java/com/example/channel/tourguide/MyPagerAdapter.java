package com.example.channel.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Channel on 02-07-2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter
{
    private String[] tabTitles=new String[]{"Numbers","Questions","Phrases","Miscellaneous"};

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        NumbersFragment numbersFragment=new NumbersFragment();
        QuestionsFragment questionsFragment=new QuestionsFragment();
        PhrasesFragment phrasesFragment=new PhrasesFragment();
        MiscFragment miscFragment=new MiscFragment();

        if(position==0)
            return numbersFragment;
        else if(position==1)
            return questionsFragment;
        else if(position==2)
            return phrasesFragment;
        else return miscFragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0)
            return tabTitles[0];
        else if(position==1)
            return tabTitles[1];
        else if(position==2)
            return tabTitles[2];
        else
            return tabTitles[3];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
