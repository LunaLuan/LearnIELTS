package com.example.asd.learnielts.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.asd.learnielts.R;

public class DangNhapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
    }

    public void clickDangKy(View view) {
        Intent intent=new Intent(DangNhapActivity.this, DangKyActivity.class);
        startActivity(intent);
    }
}
