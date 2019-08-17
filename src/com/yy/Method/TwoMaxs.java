package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 05 - 1:11
 */
public class TwoMaxs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number one:");
        int a = scanner.nextInt();
        System.out.print("number two:");
        int b = scanner.nextInt();
        int result = Maxs(a,b);
        System.out.print("the max one:");
        System.out.println(result);
    }
    public static int Maxs(int a,int b){
        int result = 0;
        result = (a > b)?a:b;
        return result;
    }
}
