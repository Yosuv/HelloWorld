package com.mootou.yosub.testapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yosub on 2018-03-21.
 */

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private List<String> strList;

    public void setData(List<String> strList){
        this.strList = strList;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vh_main, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        TextView tv = holder.itemView.findViewById(R.id.txtTitle);
        tv.setText(strList.get(position));

    }

    @Override
    public int getItemCount() {
        return (strList == null) ? 0 : strList.size();
    }
}
