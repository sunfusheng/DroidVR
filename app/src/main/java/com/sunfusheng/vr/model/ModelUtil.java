package com.sunfusheng.vr.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunfusheng on 2017/8/2.
 */
public class ModelUtil {

    public static final String[] titleArr = {
            "帝都、北京、故宫",
            "魔都、上海",
            "妖都、广州",
            "香港全景图",
            "360°太空全景",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };

    public static final String[] descArr = {
            "北京是一座有着三千多年历史的古都，是中华人民共和国的首都、直辖市。\n故宫是中国明清两代的皇家宫殿，旧称为紫禁城，位于北京中轴线的中心，是中国古代宫廷建筑之精华。",
            "魔都一词最早发源于旅居上海的日本名作家村松梢风在大概一个世纪以前的畅销小说《魔都》，在这部作品中村松梢风发明了“魔都”一词来指代上海，意为魔幻之都或者魔力之城。",
            "广州有妖都、花都之称，著名景点有花城广场、广州塔、黄埔军校、长隆欢乐世界、圣心大教堂等。",
            "香港，简称“港”，全称为中华人民共和国香港特别行政区，香港是一座高度繁荣的国际大都市，全境由香港岛、九龙半岛、新界等3大区域组成。",
            "天高地迥，绝宇宙之无穷；\n兴尽悲来，识盈虚之有数。",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };

    public static final String[] resourceArr = {
            "beijing_gugong.jpg",
            "shanghai_dongfangmingzhu.jpg",
            "guangzhou.jpg",
            "xianggang.jpg",
            "sky1.jpg",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };

    public static List<PanoramaImageModel> getPanoramaImageList() {
        List<PanoramaImageModel> list = new ArrayList<>();
        for (int i = 0; i < titleArr.length; i++) {
            list.add(new PanoramaImageModel(0, titleArr[i], descArr[i], resourceArr[i]));
        }
        return list;
    }

}
