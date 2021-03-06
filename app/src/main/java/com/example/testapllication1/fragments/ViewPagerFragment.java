package com.example.testapllication1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.testapllication1.R;
import com.example.testapllication1.adapters.ContactsFragmentPageAdapter;

public class ViewPagerFragment extends Fragment {

    public ViewPagerFragment() {
        super(R.layout.fragment_view_pager);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("Created");
        View mView = inflater.inflate(R.layout.fragment_view_pager, container, false);
        ViewPager mViewPager = mView.findViewById(R.id.viewpager);

        ContactsFragmentPageAdapter mAdapter = new ContactsFragmentPageAdapter(getChildFragmentManager(), 0);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setPageTransformer(false, (v, pos) -> {
            final float opacity = Math.abs(Math.abs(pos) - 1);
            v.setAlpha(opacity);
        });
        return mView;
    }
}
