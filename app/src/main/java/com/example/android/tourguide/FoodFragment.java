package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of food.
 */
public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of food items
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(com.example.android.tourguide.R.string.food_modern_succotash), getString(com.example.android.tourguide.R.string.food_modern_succotash_description),
                R.drawable.modern_succotash));
        words.add(new Word(getString(com.example.android.tourguide.R.string.food_chicken_tagine), getString(com.example.android.tourguide.R.string.food_chicken_tagine_description),
                R.drawable.chicken_tagine));
        words.add(new Word(getString(com.example.android.tourguide.R.string.food_blueberry_cobbler), getString(com.example.android.tourguide.R.string.food_blueberry_cobbler_description),
                R.drawable.blueberry_cobbler));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}