package com.ap.vuluan.baitap345.Bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.ap.vuluan.baitap345.R;

public class LinearLayoutActivity extends AppCompatActivity {

    RadioGroup rdg_View;
    RadioButton rd_Red, rd_Blue, rd_White;
    Button btn_Set,btn_Clear;
    TextView txt_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        initView();
        btn_Set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rd_Red.isChecked()){
                    txt_View.setBackgroundColor(getResources().getColor(R.color.Red));
                }
                if(rd_Blue.isChecked()){
                    txt_View.setBackgroundColor(getResources().getColor(R.color.Blue));
                }
                if(rd_White.isChecked()){
                    txt_View.setBackgroundColor(getResources().getColor(R.color.White));
                }

            }
        });
        btn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rd_Red.setChecked(false);
                rd_White.setChecked(false);
                rd_Blue.setChecked(false);
                txt_View.setBackgroundColor(getResources().getColor(R.color.Default));



            }
        });


    }
    private void initView (){

        rdg_View =(RadioGroup)findViewById(R.id.rdgView);
        rd_Red =(RadioButton)findViewById(R.id.rdoRed);
        rd_Blue =(RadioButton)findViewById(R.id.rdoBlue);
        rd_White =(RadioButton)findViewById(R.id.rdoWhite);
        btn_Set =(Button)findViewById(R.id.btnSetColor);
        btn_Clear =(Button)findViewById(R.id.btnClear);
        txt_View =(TextView)findViewById(R.id.txtView);

    }


}
