package com.example.asd.learnielts.holder;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.asd.learnielts.R;
import com.example.asd.learnielts.model.LoaiBaiTap;

/**
 * Created by asd on 11/7/2016.
 */

public class LoaiBaiTapHolder extends RecyclerView.ViewHolder {

    public Button btnLoaiBaiTap;

    public LoaiBaiTapHolder(View itemView) {
        super(itemView);
        btnLoaiBaiTap= (Button) itemView.findViewById(R.id.btnLoaiBaiTap);
    }
}
