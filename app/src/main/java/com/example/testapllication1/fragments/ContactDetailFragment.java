package com.example.testapllication1.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testapllication1.Common;
import com.example.testapllication1.MainActivity;
import com.example.testapllication1.PageTitleInterface;
import com.example.testapllication1.R;
import com.example.testapllication1.data.Contact;

public class ContactDetailFragment extends Fragment {

    public ContactDetailFragment() {
        super(R.layout.fragment_contact_detail);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Contact contact = arguments.getParcelable("contact");

        ((TextView) view.findViewById(R.id.detail_name)).setText(contact.getName());
        ((TextView) view.findViewById(R.id.detail_phone)).setText(contact.getPhone());

        view.findViewById(R.id.delete_button).setOnClickListener(v -> {
            Common.contacts.remove(contact);
            ((ContactsFragment) Common.pageFragments.get(0)).refreshAdapter();
            getActivity().onBackPressed();
        });
    }
}
