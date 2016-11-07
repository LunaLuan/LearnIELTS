package com.example.asd.learnielts.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.asd.learnielts.holder.LoaiBaiTapHolder;
import com.example.asd.learnielts.model.LoaiBaiTap;

import java.util.List;

/**
 * Created by asd on 11/7/2016.
 */

public class DanhSachLoaiBaiTapAdapter extends RecyclerView.Adapter<LoaiBaiTapHolder> {

    private List<LoaiBaiTap> danhSachLoaiBaiTap;

    public DanhSachLoaiBaiTapAdapter(List<LoaiBaiTap> danhSachLoaiBaiTap) {
        this.danhSachLoaiBaiTap= danhSachLoaiBaiTap;
    }


    @Override
    public LoaiBaiTapHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(LoaiBaiTapHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
