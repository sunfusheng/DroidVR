package com.sunfusheng.vr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;
import com.sunfusheng.vr.adapter.PanoramaImageAdapter;
import com.sunfusheng.vr.model.ModelUtil;
import com.sunfusheng.vr.utils.ImageUtil;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private ImageView ivMine;
    public VrPanoramaView vrPanoramaView;
    private RecyclerView recyclerView;

    private PanoramaImageAdapter mAdapter;
    private int currPosition = 0;

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
        vrPanoramaView = (VrPanoramaView) findViewById(R.id.vrPanoramaView);

        ImageUtil.colorImageViewDrawable(ivMine, R.color.transparent60_white);

        loadPanoramaImage(ModelUtil.getPanoramaImageList().get(currPosition).assetName);

        mAdapter = new PanoramaImageAdapter(this, ModelUtil.getPanoramaImageList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
    }

    private void initListener() {
        ivMine.setOnClickListener(v -> {

        });

        mAdapter.setOnItemClickListener((adapter, view, position) -> {
            if (currPosition == position) return;
            currPosition = position;
            String assetName = mAdapter.getData().get(position).assetName;
            loadPanoramaImage(assetName);
        });
    }

    private void loadPanoramaImage(String assetName) {
        try {
            InputStream inputStream = getAssets().open(assetName);
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            vrPanoramaView.setTouchTrackingEnabled(true);
            vrPanoramaView.setFullscreenButtonEnabled(true);
            vrPanoramaView.setInfoButtonEnabled(false);
            vrPanoramaView.setStereoModeButtonEnabled(false);
            VrPanoramaView.Options options = new VrPanoramaView.Options();
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            vrPanoramaView.loadImageFromBitmap(bitmap, options);
            vrPanoramaView.setOnClickListener(v -> {
                Toast.makeText(this, "setDisplayMode()", Toast.LENGTH_SHORT).show();
                vrPanoramaView.setDisplayMode(2);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        vrPanoramaView.resumeRendering();
    }

    @Override
    protected void onPause() {
        super.onPause();
        vrPanoramaView.pauseRendering();
    }

    @Override
    protected void onDestroy() {
        vrPanoramaView.shutdown();
        super.onDestroy();
    }
}
