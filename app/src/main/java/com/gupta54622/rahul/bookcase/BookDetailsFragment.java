package com.gupta54622.rahul.bookcase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BookDetailsFragment extends Fragment {

    TextView textViewBookTitle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bookdetails_fragment_layout,container,false);

        textViewBookTitle = view.findViewById(R.id.textViewBookTitle);

        String title = "Title: " + "Story " + getArguments().getInt("BOOK_NUMBER");

        displayBook(title);

        return  view;
    }

    void displayBook(String title){
        textViewBookTitle.setText(title);
    }
}
