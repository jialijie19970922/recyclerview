package com.example.demo.jlj.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2018/7/15/015.
 */

public class Recycler_variety_Adapter  extends RecyclerView.Adapter {

    //定义三种常量  表示三种条目类型
    public static final int TYPE_PULL_IMAGE = 0;
    public static final int TYPE_RIGHT_IMAGE = 1;
    public static final int TYPE_THREE_IMAGE = 2;
    private List<MoreTypeBean> mData;

    public Recycler_variety_Adapter(List<MoreTypeBean> data) {
        this.mData = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //创建不同的 ViewHolder
        View view;
        //根据viewtype来创建条目

        if (viewType == TYPE_PULL_IMAGE) {
            view =View.inflate(parent.getContext(),R.layout.item_pull_img,null);
            return new PullImageHolder(view);
        } else if (viewType == TYPE_RIGHT_IMAGE) {
            view =View.inflate(parent.getContext(),R.layout.item_right_img,null);
            return new RightImageHolder(view);
        } else {
            view =View.inflate(parent.getContext(),R.layout.item_three_img,null);
            return new ThreeImageHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (mData != null) {
            return mData.size();
        }
        return 0;
    }

    //根据条件返回条目的类型
    @Override
    public int getItemViewType(int position) {

        MoreTypeBean moreTypeBean = mData.get(position);
        if (moreTypeBean.type == 0) {
            return TYPE_PULL_IMAGE;
        } else if (moreTypeBean.type == 1) {
            return TYPE_RIGHT_IMAGE;
        } else {
            return TYPE_THREE_IMAGE;
        }


    }

    /**
     * 创建三种ViewHolder
     */
    private class PullImageHolder extends RecyclerView.ViewHolder {

        public PullImageHolder(View itemView) {
            super(itemView);
        }
    }

    private class RightImageHolder extends RecyclerView.ViewHolder {

        public RightImageHolder(View itemView) {
            super(itemView);
        }
    }

    private class ThreeImageHolder extends RecyclerView.ViewHolder {

        public ThreeImageHolder(View itemView) {
            super(itemView);
        }
    }
}