package com.ish.mylibrary;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by ish on 2018/3/15.
 */

public class TView extends LinearLayout implements View.OnClickListener{
    private Button btn;
    private Context mContext;
    public TView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.t_layout,this);
        btn = (Button)findViewById(R.id.btn_back);
        btn.setOnClickListener(this);
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(mContext, "click", Toast.LENGTH_SHORT).show();
    }
}
