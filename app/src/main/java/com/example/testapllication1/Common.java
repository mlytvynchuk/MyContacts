package com.example.testapllication1;

import com.example.testapllication1.data.Contact;
import com.example.testapllication1.fragments.ContactsFragment;
import com.example.testapllication1.fragments.CreateContactFragment;

import java.util.ArrayList;
import java.util.HashMap;

public class Common {
    public static HashMap<Integer, PageTitleInterface> pageFragments = new HashMap<Integer, PageTitleInterface>() {{
        put(0, new ContactsFragment());
        put(1, new CreateContactFragment());
    }};

    public static ArrayList<Contact> contacts = new ArrayList<Contact>() {{
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
        add(new Contact("Oleh", "+380 66 321 5671"));
        add(new Contact("Vasya", "+380 21 043 1234"));
        add(new Contact("Petro", "+380 50 321 1231"));
        add(new Contact("Maksym", "+380 66 040 7712"));
    }};
}
