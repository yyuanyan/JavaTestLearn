package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 05 - 1:17
 */
public class TwoEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number one:");
        int a = scanner.nextInt();
        System.out.print("number two:");
        int b = scanner.nextInt();
        Equals(a,b);
    }
    public static void Equals(int a,int b){
        String result = "YES";
        if(a==b){
            System.out.println("yes");
        }
        else System.out.println("no");

    }
}
