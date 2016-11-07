package com.example.asd.learnielts.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.asd.learnielts.R;
import com.example.asd.learnielts.model.BaiHoc;

import java.util.List;

public class BaiHocActivity extends AppCompatActivity {

    private List<BaiHoc> danhSachBaiHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_hoc);

    }


}
