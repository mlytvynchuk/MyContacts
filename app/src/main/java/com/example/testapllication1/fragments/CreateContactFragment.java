package com.example.testapllication1.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testapllication1.Common;
import com.example.testapllication1.MainActivity;
import com.example.testapllication1.PageTitleInterface;
import com.example.testapllication1.R;
import com.example.testapllication1.data.Contact;
import com.google.android.material.textfield.TextInputLayout;

public class CreateContactFragment extends Fragment implements PageTitleInterface {

    private static final String pageTitle = "Create";

    public static String getPageTitle() {
        return pageTitle;
    }

    public CreateContactFragment() {
        super(R.layout.fragment_create_contact);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button createButton = view.findViewById(R.id.create_button);
        TextInputLayout nameInput = view.findViewById(R.id.name_input);
        TextInputLayout phoneInput = view.findViewById(R.id.phone_input);

        createButton.setOnClickListener(v -> {
            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

            String name = nameInput.getEditText().getText().toString();
            String phone = phoneInput.getEditText().getText().toString();
            Common.contacts.add(new Contact(name, phone));

            ((ContactsFragment) Common.pageFragments.get(0)).refreshAdapter();
            nameInput.getEditText().setText("");
            phoneInput.getEditText().setText("");
            nameInput.getEditText().clearFocus();
            phoneInput.getEditText().clearFocus();
        });
    }

    @Override
    public String getTitle() {
        return pageTitle;
    }
}
