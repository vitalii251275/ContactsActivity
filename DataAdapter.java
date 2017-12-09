package com.example.android.contactsactivity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Администратор on 04.12.2017.
 */


    class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

        private LayoutInflater inflater;
        private List<Contact> contacts;

        DataAdapter(Context context, List<Contact> contacts) {
            this.contacts = contacts;
            this.inflater = LayoutInflater.from(context);
        }
        @Override
        public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = inflater.inflate(R.layout.list_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
            Contact contact = contacts.get(position);

            holder.nameView.setText(contact.getName());
            //holder.IdView.setText(contact.getId());
            holder.secondNameView.setText(contact.getSecondName());

        }

        @Override
        public int getItemCount() {
            return contacts.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            final TextView nameView, secondNameView;
            ViewHolder(View view){
                super(view);

                nameView = (TextView) view.findViewById(R.id.name);

                secondNameView = (TextView) view.findViewById(R.id.secondName);

            }
        }
    }

