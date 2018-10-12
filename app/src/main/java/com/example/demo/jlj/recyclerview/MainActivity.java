package com.example.demo.jlj.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int[] icons = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};
    private List<MoreTypeBean> mData;
    private RecyclerView re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initViewOper();
    }
    private void initView() {
        re = findViewById(R.id.re);
    }

    private void initData() {
        mData = new ArrayList<>();
//        随机数 用来标记item界面的类型
        Random random = new Random();

        for (int i = 0; i < icons.length; i++) {
            MoreTypeBean more = new MoreTypeBean();

            more.pic = icons[i];
            more.type = random.nextInt(3);
            mData.add(more);
        }
    }

    private void initViewOper() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        re.setLayoutManager(linearLayoutManager);
        Recycler_variety_Adapter adapter = new Recycler_variety_Adapter(mData);
        re.setAdapter(adapter);
    }

}
