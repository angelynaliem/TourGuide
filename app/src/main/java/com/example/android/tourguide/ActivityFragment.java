package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of activities.
 */
public class ActivityFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of activity items
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(com.example.android.tourguide.R.string.activity_cutting_board), getString(com.example.android.tourguide.R.string.activity_cutting_board_description),
                R.drawable.cutting_board));
        words.add(new Word(getString(com.example.android.tourguide.R.string.activity_piano), getString(com.example.android.tourguide.R.string.activity_piano_description),
                R.drawable.piano));
        words.add(new Word(getString(com.example.android.tourguide.R.string.activity_vacuum_cleaner), getString(com.example.android.tourguide.R.string.activity_vacuum_cleaner_description),
                R.drawable.vacuum));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}