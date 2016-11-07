package com.example.asd.learnielts.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.asd.learnielts.R;

import java.util.List;

public class DanhSachLoaiBaiTapActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_loai_bai_tap);
    }

    public void clickLoaiBaiTap(View view) {
        int id= view.getId();

        if(id== R.id.btnDoc) {
            Intent intent=new Intent(DanhSachLoaiBaiTapActivity.this, BaiDocActivity.class);
            startActivity(intent);
        }
        if(id== R.id.btnNghe) {
            Intent intent=new Intent(DanhSachLoaiBaiTapActivity.this, BaiNgheActivity.class);
            startActivity(intent);
        }
    }

    public void clickXemDiem(View view) {
        Intent intent= new Intent(DanhSachLoaiBaiTapActivity.this, TongDiemActivity.class);
        startActivity(intent);
    }
}
