package com.sunfusheng.vr.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;
import com.sunfusheng.vr.R;
import com.sunfusheng.vr.model.PanoramaImageModel;

import java.io.InputStream;
import java.util.List;

/**
 * @author sunfusheng on 2017/8/25.
 */
public class PanoramaImageAdapter extends BaseMultiItemQuickAdapter<PanoramaImageModel, BaseViewHolder> {

    private Context context;
    public VrPanoramaView vrPanoramaView;

    public PanoramaImageAdapter(Context context, List<PanoramaImageModel> data) {
        super(data);
        this.context = context;
        addItemType(0, R.layout.item_panorana_image);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    @Override
    protected void convert(BaseViewHolder helper, PanoramaImageModel item) {
        helper.setText(R.id.tv_title, item.title);
        helper.setText(R.id.tv_desc, item.desc);
        loadPanoramaImage(helper.getView(R.id.vrPanoramaView), item.resource);
        helper.itemView.setOnClickListener(v -> {
            vrPanoramaView = helper.getView(R.id.vrPanoramaView);
            vrPanoramaView.setDisplayMode(2);
        });
    }

    private void loadPanoramaImage(VrPanoramaView vrPanoramaView, String imageName) {
        try {
            InputStream inputStream = context.getAssets().open(imageName);
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            vrPanoramaView.setTouchTrackingEnabled(true);
            vrPanoramaView.setFullscreenButtonEnabled(true);
            vrPanoramaView.setInfoButtonEnabled(false);
            vrPanoramaView.setStereoModeButtonEnabled(false);
            VrPanoramaView.Options options = new VrPanoramaView.Options();
            options.inputType = VrPanoramaView.Options.TYPE_MONO;
            vrPanoramaView.loadImageFromBitmap(bitmap, options);
            vrPanoramaView.setOnClickListener(v -> {
                Toast.makeText(context, "setDisplayMode()", Toast.LENGTH_SHORT).show();
                vrPanoramaView.setDisplayMode(2);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
