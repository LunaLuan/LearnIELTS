package com.example.asd.learnielts.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.asd.learnielts.R;
import com.example.asd.learnielts.adapter.DanhSachBaiHocAdapter;
import com.example.asd.learnielts.model.BaiHoc;

import java.util.ArrayList;
import java.util.List;

public class DanhSachBaiHocActivity extends AppCompatActivity {

    private RecyclerView rvBaiHoc;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<BaiHoc> danhSachBaiHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_bai_hoc);

        rvBaiHoc=(RecyclerView) findViewById(R.id.rvBaiHoc);
        rvBaiHoc.setHasFixedSize(true);

        mLayoutManager=new LinearLayoutManager(this);
        rvBaiHoc.setLayoutManager(mLayoutManager);

        mAdapter=new DanhSachBaiHocAdapter(danhSachBaiHoc);
        rvBaiHoc.setAdapter(mAdapter);
    }

    public void getData() {
        danhSachBaiHoc=new ArrayList<>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_danh_sach_bai_hoc, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_dang_nhap) {
            Intent intent= new Intent(DanhSachBaiHocActivity.this, DangNhapActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
