package com.sunfusheng.vr.model;

import com.sunfusheng.vr.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunfusheng on 2017/8/2.
 */
public class ModelUtil {

    public static final String[] titleArr = {
            "帝都、北京",
            "魔都、上海",
            "妖都、广州",
            "香江、香港",
            "360°太空全景",
            "从月球望地球",
            "迪拜塔",
            "希腊、圣托里尼岛",
            "马尔代夫全景",
            "马尔代夫、瑞喜敦岛",
            "海底世界",
            "星空与极光",
            "尼亚加拉瀑布"
    };

    public static final String[] descArr = {
            "北京是一座有着三千多年历史的古都，是中华人民共和国的首都、直辖市。\n故宫是中国明清两代的皇家宫殿，旧称为紫禁城，位于北京中轴线的中心，是中国古代宫廷建筑之精华。",
            "魔都一词最早发源于旅居上海的日本名作家村松梢风在大概一个世纪以前的畅销小说《魔都》，在这部作品中村松梢风发明了“魔都”一词来指代上海，意为魔幻之都或者魔力之城。",
            "广州有妖都、花都之称，著名景点有花城广场、广州塔、黄埔军校、长隆欢乐世界、圣心大教堂等。",
            "香港，简称“港”，全称为中华人民共和国香港特别行政区，香港是一座高度繁荣的国际大都市，全境由香港岛、九龙半岛、新界等3大区域组成。",
            "天高地迥，绝宇宙之无穷；\n兴尽悲来，识盈虚之有数。",
            "我们的征途是星辰大海！",
            "迪拜塔是世界第一高楼与人工构造物，楼层总数162层，造价15亿美元。\n迪拜塔也叫哈利法塔，在古阿拉伯世界中，哈利法为“伊斯兰世界最高领袖”之意，同时也是历史上阿拉伯帝国统治者的称号。",
            "圣托里尼（Santorini）是在希腊大陆东南200公里的爱琴海上由一群火山组成的岛环，圣托里尼岛环上最大的一个岛也叫圣托里尼岛。",
            "马尔代夫全称：马尔代夫共和国位于南亚，是印度洋上的一个岛国，也是世界上最大的珊瑚岛国。由1200余个小珊瑚岛屿组成，其中202个岛屿有人居住，从空中鸟瞰就像一串珍珠撒在印度洋上。面积298平方公里（不计算领海），是亚洲最小的国家。",
            "马尔代夫瑞喜敦岛是世界上最大的珊瑚岛国，由众多小岛组成。岛上水屋排排而建，水屋下即是温暖的海水，伸脚下去，就有海水潮起潮落，轻柔抚摸。海上风光旖旎，海底世界也别有一翻天地，潜入海底，与斑斓鱼儿一同享受海底世界的欢愉与宁静，或是细心找寻被遗失海底的珍石奇饰，亲临海底王国，去感受这触摸得到的水下天堂。",
            "在距离我们很近，又很遥远的地方，有一个广阔的深蓝色的海底世界。在这个世界的海底，生活着无数的小鱼和大鱼，他们天真烂漫、和平友好，生活的无忧无虑。他们住着珊瑚和贝壳建造成的小屋、吃着五颜六色的海底美食。",
            "极光，是一种绚丽多彩的发光现象，其发生是由于太阳带电粒子流（太阳风）进入地球磁场，在地球南北两极附近地区的高空，夜间出现的灿烂美丽的光辉。在南极被称为南极光，在北极被称为北极光。",
            "尼亚加拉瀑布(Niagara Falls)位于加拿大安大略省和美国纽约州的交界处，瀑布源头为尼亚加拉河，主瀑布位于加拿大境内，是瀑布的最佳观赏地；在美国境内瀑布由月亮岛隔开，观赏的是瀑布侧面。同时，该瀑布也是世界第一大跨国瀑布。"
    };

    public static final String[] assetArr = {
            "beijing_gugong.jpg",
            "shanghai_dongfangmingzhu.jpg",
            "guangzhou.jpg",
            "xianggang.jpg",
            "sky1.jpg",
            "sky2.jpg",
            "dibaita.jpg",
            "santorini.jpg",
            "maldives.jpg",
            "residence.jpg",
            "haidishijie.jpg",
            "jiguang.jpg",
            "niagara_falls.jpg"
    };

    public static final int[] resourceArr = {
            R.mipmap.beijing_gugong,
            R.mipmap.shanghai_dongfangmingzhu,
            R.mipmap.guangzhou,
            R.mipmap.xianggang,
            R.mipmap.sky1,
            R.mipmap.sky2,
            R.mipmap.dibaita,
            R.mipmap.santorini,
            R.mipmap.maldives,
            R.mipmap.residence,
            R.mipmap.haidishijie,
            R.mipmap.jiguang,
            R.mipmap.niagara_falls
    };

    public static List<PanoramaImageModel> getPanoramaImageList() {
        List<PanoramaImageModel> list = new ArrayList<>();
        for (int i = 0; i < titleArr.length; i++) {
            list.add(new PanoramaImageModel(0, titleArr[i], descArr[i], assetArr[i], resourceArr[i]));
        }
        return list;
    }

}
