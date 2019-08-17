package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 05 - 23:07
 */
public class ArrayTraverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.nextLine();
        String[] str = s.split(" ");
        for(String data : str)
            System.out.println(data);
        //System.out.println(str[9]);
        for (int i = 0; i <7; i++) {
            //System.out.println(a[i]);
            for (int j = i; j < 8; j++) {
                for (int k = j; k < 9; k++) {
                    int[] a = new int [9];
                    a[k] = Integer.parseInt(str[k]);
                    if(a[i]+a[j]+a[k]==0){
                        System.out.println("--------------------");
                        System.out.println(i+j+k);
                    }
                }
            }
        }
    }
}
