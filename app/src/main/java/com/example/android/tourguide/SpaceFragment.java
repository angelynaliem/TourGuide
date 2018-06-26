package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of spaces.
 */
public class SpaceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of space items
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(com.example.android.tourguide.R.string.space_playground), getString(com.example.android.tourguide.R.string.space_playground_description),
                R.drawable.playground));
        words.add(new Word(getString(com.example.android.tourguide.R.string.space_living_room), getString(com.example.android.tourguide.R.string.space_living_room_description),
                R.drawable.living_room));
        words.add(new Word(getString(com.example.android.tourguide.R.string.space_kitchen), getString(com.example.android.tourguide.R.string.space_kitchen_description),
                R.drawable.kitchen));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}