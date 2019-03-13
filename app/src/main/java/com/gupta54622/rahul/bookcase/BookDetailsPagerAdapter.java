package com.gupta54622.rahul.bookcase;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class BookDetailsPagerAdapter extends FragmentStatePagerAdapter {
    public BookDetailsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        BookDetailsFragment bookDetailsFragment = new BookDetailsFragment();

        //Create bundle object to pass information
        Bundle bundle = new Bundle();
        i = i + 1;
        bundle.putInt("BOOK_NUMBER", i );
        bookDetailsFragment.setArguments(bundle);
        return bookDetailsFragment;
    }

    @Override
    public int getCount() {

        // return number of pages
        return 10;
    }
}
