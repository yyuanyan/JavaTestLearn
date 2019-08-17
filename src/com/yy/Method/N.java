package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 05 - 1:48
 */
public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number:");
        int x = scanner.nextInt();
        NPrint(x);
    }
    public static void NPrint(int x){
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
