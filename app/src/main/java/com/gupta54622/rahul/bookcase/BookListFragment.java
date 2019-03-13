package com.gupta54622.rahul.bookcase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BookListFragment extends Fragment{


    // bookList of 10 books
    List<String> bookList = new ArrayList<String>(){{
        add("Book1");
        add("Book2");
        add("Book3");
        add("Book4");
        add("Book5");
        add("Book6");
        add("Book7");
        add("Book8");
        add("Book9");
        add("Book10");
    }};

    ListView listViewBookList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Initialize booklistview
        View view = inflater.inflate(R.layout.booklist_fragment_layout, container, false);
        listViewBookList = view.findViewById(R.id.listViewBookList);

        //Create an array adapter to populate book list view
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,bookList);

        // attach this adapter to listViewBookList
        listViewBookList.setAdapter(stringArrayAdapter);
        return view;
    }
}
