package com.example.testapllication1.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testapllication1.R;
import com.example.testapllication1.data.Contact;
import com.example.testapllication1.fragments.ContactDetailFragment;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Contact> contacts;

    public ContactsAdapter(Context context, List<Contact> contacts) {
        this.contacts = contacts;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    @NonNull
    @Override
    public ContactsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.view_holder_contact_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactsAdapter.ViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.nameView.setText(contact.getName());
        holder.phoneView.setText(contact.getPhone());

        holder.itemView.setOnClickListener(v -> {
            AppCompatActivity activity = (AppCompatActivity) v.getContext();
            ContactDetailFragment fragment = new ContactDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("contact", contact);
            fragment.setArguments(bundle);
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment, "contactDetail").addToBackStack(null).commit();
        });
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, phoneView;

        ViewHolder(View view) {
            super(view);
            nameView = view.findViewById(R.id.name);
            phoneView = view.findViewById(R.id.phone);
        }
    }

}
