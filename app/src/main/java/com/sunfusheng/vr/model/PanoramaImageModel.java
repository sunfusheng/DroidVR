package com.sunfusheng.vr.model;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * @author sunfusheng on 2017/8/25.
 */
public class PanoramaImageModel implements MultiItemEntity {

    public int type;
    public String title;
    public String desc;
    public String resource;

    public PanoramaImageModel(String title, String resource) {
        this.title = title;
        this.resource = resource;
    }

    public PanoramaImageModel(String title, String desc, String resource) {
        this.title = title;
        this.desc = desc;
        this.resource = resource;
    }

    public PanoramaImageModel(int type, String title, String desc, String resource) {
        this.type = type;
        this.title = title;
        this.desc = desc;
        this.resource = resource;
    }

    @Override
    public int getItemType() {
        return type;
    }
}
