package com.example.testapllication1.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testapllication1.Common;
import com.example.testapllication1.MainActivity;
import com.example.testapllication1.PageTitleInterface;
import com.example.testapllication1.R;
import com.example.testapllication1.adapters.ContactsAdapter;
import com.example.testapllication1.data.Contact;

import java.util.ArrayList;

public class ContactsFragment extends Fragment implements PageTitleInterface {

    private static ContactsAdapter contactsAdapter;
    private static final String pageTitle = "Contacts";

    public ContactsFragment() {
        super(R.layout.fragment_contacts);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_contact_list);
        contactsAdapter = new ContactsAdapter(this.getContext(), Common.contacts);
        recyclerView.setAdapter(contactsAdapter);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    public void refreshAdapter() {
        if (contactsAdapter != null) {
            contactsAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public String getTitle() {
        return pageTitle;
    }
}