package com.sunfusheng.vr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.sunfusheng.vr.adapter.PanoramaImageAdapter;
import com.sunfusheng.vr.model.ModelUtil;
import com.sunfusheng.vr.utils.ImageUtil;

public class MainActivity extends AppCompatActivity {

    private ImageView ivMine;
    private RecyclerView recyclerView;

    private PanoramaImageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
    }

    private void initView() {
        ivMine = (ImageView) findViewById(R.id.iv_mine);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ImageUtil.colorImageViewDrawable(ivMine, R.color.transparent60_white);

        mAdapter = new PanoramaImageAdapter(this, ModelUtil.getPanoramaImageList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
    }

    private void initListener() {
        ivMine.setOnClickListener(v -> {

        });

        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }
}
