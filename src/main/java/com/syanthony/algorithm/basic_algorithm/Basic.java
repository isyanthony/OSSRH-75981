package com.syanthony.algorithm.basic_algorithm;

import java.util.List;

/**
 * @author: Anthony
 * @Date: 2021/12/11 16:46
 * @Version: 1.0.0
 * @description: 基础算法封装
 */

public class Basic {

    /**
     * List<Object>集合去重:重复元素置于列表末尾
     * @param list 源数据集合
     * @return 返回第一个重复元素的下标
     */
    public static int unique(List<Object> list){
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || !list.get(i).equals(list.get(i - 1))) {
                list.set(j++, list.get(i));
            }
        }
        return j;
    }


    public static void main(String[] args) {
        System.out.println(Integer.valueOf("1").equals(1));
    }
}
