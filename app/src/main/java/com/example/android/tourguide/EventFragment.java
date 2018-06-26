package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of events.
 */
public class EventFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of event items
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(com.example.android.tourguide.R.string.event_housewarming), getString(com.example.android.tourguide.R.string.event_housewarming_description),
                R.drawable.housewarming));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}