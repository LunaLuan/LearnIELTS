package com.example.asd.learnielts.holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.asd.learnielts.activity.BaiOnTapActivity;

/**
 * Created by asd on 11/7/2016.
 */

public class BaiHocHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    public BaiHocHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(v.getContext(), BaiOnTapActivity.class);
        v.getContext().startActivity(intent);
    }
}
