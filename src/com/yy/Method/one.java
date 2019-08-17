package com.yy.Method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 11 - 19:16
 */
public class one {
    //字节跳动笔试第一题
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bufferedReader.readLine());
        String[] strings = new String[2];
        int[] clocks = new int [n];
        for (int i = 0; i < n; i++) {
            strings = bufferedReader.readLine().split(" ");
            clocks[i] = Integer.valueOf(strings[0]) * 60 + Integer.valueOf(strings[1]);
        }
        Arrays.sort(clocks);

        int Time = Integer.valueOf(bufferedReader.readLine());
        strings = bufferedReader.readLine().split(" ");
        int SchoolTime = Integer.valueOf(strings[0]) * 60 + Integer.valueOf(strings[1]);
        int LTime = SchoolTime - Time;

        int x = n - 1;
        while (LTime < clocks[x]){
            x--;
        }
        int min = clocks[x] % 60;
        int hour = clocks[x] / 60;

        System.out.println(hour + " " + min);
    }
}
