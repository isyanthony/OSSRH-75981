package com.syanthony.algorithm.convert;

/**
 * @author: Anthony
 * @Date: 2021/12/11 17:11
 * @Version: 1.0.0
 * @description: 数组工具类
 */
public class ArrayUtils {

    public static int [] strToInt(String [] strs){
        int [] array = new int[strs.length];
        int j = 0;
        for (String item : strs) {
            array[j++] = Integer.parseInt(item);
        }
        return array;
    }
}
