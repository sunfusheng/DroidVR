package com.sunfusheng.vr.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.sunfusheng.vr.model.PanoramaImageModel;

import java.util.List;

/**
 * @author sunfusheng on 2017/8/25.
 */
public class PanoramaImageAdapter extends BaseMultiItemQuickAdapter<PanoramaImageModel, BaseViewHolder> {

    public PanoramaImageAdapter(List<PanoramaImageModel> data) {
        super(data);

    }

    @Override
    protected void convert(BaseViewHolder helper, PanoramaImageModel item) {

    }
}
