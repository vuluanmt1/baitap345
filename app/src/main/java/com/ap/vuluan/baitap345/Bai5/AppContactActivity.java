package com.ap.vuluan.baitap345.Bai5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.ap.vuluan.baitap345.R;

import java.util.ArrayList;

public class AppContactActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_contact);

        initView();

    }
    public void initView(){

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcvView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<Contact> arrayList = new ArrayList<>();
        arrayList.add(new Contact("VU VAN A",12345));
        arrayList.add(new Contact("VU VAN B",123456));
        arrayList.add(new Contact("VU VAN C",123457));
        arrayList.add(new Contact("VU VAN D",123458));
        arrayList.add(new Contact("VU VAN G",123459));
        arrayList.add(new Contact("VU VAN H",1234510));
        arrayList.add(new Contact("VU VAN L",1234511));
        ContacAdapter contacAdapter = new ContacAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(contacAdapter);
    }

}
