package com.sunfusheng.vr.model;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * @author sunfusheng on 2017/8/25.
 */
public class PanoramaImageModel implements MultiItemEntity {

    public int type;
    public String title;
    public String desc;
    public String assetName;
    public int resourceName;

    public PanoramaImageModel(int type, String title, String desc, String assetName, int resourceName) {
        this.type = type;
        this.title = title;
        this.desc = desc;
        this.assetName = assetName;
        this.resourceName = resourceName;
    }

    @Override
    public int getItemType() {
        return type;
    }
}
