package com.syanthony.algorithm.io;

import com.syanthony.algorithm.convert.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author: Anthony
 * @Date: 2021/12/11 16:55
 * @Version: 1.0.0
 * @description: 控制台IO工具类
 */
public class IOUtils {

    /**
     * 使用Scanner进行控制台数据读取Int
     * @param sc Scanner对象
     * @return Int值
     */
    public static int readInt(Scanner sc){
        return sc.nextInt();
    }

    /**
     * 使用Scanner读取String
     * @param sc Scanner对象
     * @return String值
     */
    public static String readStr(Scanner sc){
        return sc.next();
    }

    /**
     * 使用Scanner读取Array Int
     * @param sc Scanner对象
     * @return Int 数组
     */
    public static int [] readArrayInt(Scanner sc){
        String[] str = sc.nextLine().split(" ");
        return ArrayUtils.strToInt(str);
    }

    /**
     * 使用BufferedReader读取Array Int
     * @param bf Scanner对象
     * @return Int 数组
     */
    public static int [] readArrayInt(BufferedReader bf){
        String[] str = new String[0];
        try {
            str = bf.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ArrayUtils.strToInt(str);
    }

}
