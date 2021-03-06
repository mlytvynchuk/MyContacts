package com.example.testapllication1.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.testapllication1.Common;
import com.example.testapllication1.PageTitleInterface;
import com.example.testapllication1.fragments.ContactsFragment;
import com.example.testapllication1.fragments.CreateContactFragment;

public class ContactsFragmentPageAdapter extends FragmentStatePagerAdapter {
    public ContactsFragmentPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return Common.pageFragments.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return (Fragment) Common.pageFragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Common.pageFragments.get(position).getTitle();
    }
}
