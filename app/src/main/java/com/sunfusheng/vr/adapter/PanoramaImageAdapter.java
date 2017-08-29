package com.sunfusheng.vr.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.sunfusheng.vr.R;
import com.sunfusheng.vr.model.PanoramaImageModel;

import java.util.List;

/**
 * @author sunfusheng on 2017/8/25.
 */
public class PanoramaImageAdapter extends BaseMultiItemQuickAdapter<PanoramaImageModel, BaseViewHolder> {

    private Context context;

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
        helper.setImageResource(R.id.imageView, item.resourceName);
    }

}
