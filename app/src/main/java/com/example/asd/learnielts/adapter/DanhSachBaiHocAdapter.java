package com.example.asd.learnielts.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asd.learnielts.R;
import com.example.asd.learnielts.holder.BaiHocHolder;
import com.example.asd.learnielts.model.BaiHoc;

import java.util.List;

/**
 * Created by asd on 11/7/2016.
 */

public class DanhSachBaiHocAdapter extends RecyclerView.Adapter<BaiHocHolder> {

    private List<BaiHoc> danhSachBaiHoc;


    public DanhSachBaiHocAdapter(List<BaiHoc> danhSachBaiHoc) {
        this.danhSachBaiHoc= danhSachBaiHoc;

    }

    @Override
    public BaiHocHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_bai_hoc, parent, false);
        return new BaiHocHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BaiHocHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
