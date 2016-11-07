package com.example.asd.learnielts.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.asd.learnielts.R;

public class BaiOnTapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_on_tap);
    }

    public void clickLamBaiTap(View view) {
        Intent intent=new Intent(BaiOnTapActivity.this, DanhSachLoaiBaiTapActivity.class);
        startActivity(intent);
    }
}
