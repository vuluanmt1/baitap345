package com.ap.vuluan.baitap345.Bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ap.vuluan.baitap345.R;


public class TableLayoutActivity extends AppCompatActivity {

    Button btn_Color1, btn_Color2, btn_Color3, btn_Clear;
    TextView txt_View;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        initView();

        btn_Color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_View.setBackgroundColor(getResources().getColor(R.color.Red));

            }
        });
        btn_Color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_View.setBackgroundColor(getResources().getColor(R.color.Yellow));
            }
        });
        btn_Color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_View.setBackgroundColor(getResources().getColor(R.color.Blue));
            }
        });

        btn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_View.setBackgroundColor(getResources().getColor(R.color.Default));
            }
        });

    }
    private void initView (){

        btn_Color1 = (Button)findViewById(R.id.btnColor1);
        btn_Color2 = (Button)findViewById(R.id.btnColor2);
        btn_Color3 = (Button)findViewById(R.id.btnColor3);
        btn_Clear = (Button)findViewById(R.id.btnClear);
        txt_View = (TextView)findViewById(R.id.txtView);


    }
}
