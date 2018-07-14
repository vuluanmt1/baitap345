package com.ap.vuluan.baitap345.Bai5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.ap.vuluan.baitap345.R;

import java.util.ArrayList;

public class ContacAdapter extends RecyclerView.Adapter<ContacAdapter.viewHolder> {

    ArrayList<Contact> contacts;
    Context context;

    public ContacAdapter(ArrayList<Contact> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View iView = inflater.inflate(R.layout.dong_layout,parent,false);

        return new viewHolder(iView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.txtContact.setText(contacts.get(position).getName());
        holder.txtPhone.setText(""+contacts.get(position).getNumber());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView txtContact,txtPhone;


        public viewHolder(View itemView) {
            super(itemView);

            txtContact = (TextView) itemView.findViewById(R.id.txtContactName);
            txtPhone = (TextView)itemView.findViewById(R.id.txtPhoneNumber);

        }
    }


}
