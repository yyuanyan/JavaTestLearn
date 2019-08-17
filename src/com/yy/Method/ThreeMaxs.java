package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 05 - 1:23
 */
public class ThreeMaxs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number one:");
        int a = scanner.nextInt();
        System.out.print("number two:");
        int b = scanner.nextInt();
        System.out.print("number three:");
        int c = scanner.nextInt();
        int result = Maxs(a,b,c);
        System.out.print("the max one:");
        System.out.println(result);
    }
    public static int Maxs(int a,int b,int c){
        int result = 0;
        result = (((a>b)?a:b)>c)?((a>b)?a:b):c;
        return result;
    }
}
