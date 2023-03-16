package learnDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: t2
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/21
 **/
public class t2 {
    public static void main(String[] args){

        // 创建一个动态数组
        ArrayList<String> sites = new ArrayList<>();

        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Wiki");
        System.out.println("网站列表: " + sites);
        List<String> list = sites.subList(1, 3);
        list.add("aaaa");
        // 元素位置为1到3
        System.out.println("网站列表: " + sites);
    }

}
