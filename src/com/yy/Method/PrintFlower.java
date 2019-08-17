package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 05 - 1:37
 */
public class PrintFlower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the number:");
        int x = scanner.nextInt();
        PrintFlower(x);
    }
    public static void PrintFlower(int x){
        int ge = x%10%10;
        System.out.print("个位数："+ge+"   ");
        int shi = x/10%10;
        System.out.print("十位数："+shi+"   ");
        int bai = x/100;
        System.out.println("百位数："+bai+"   ");
        if (ge*ge*ge+shi*shi*shi+bai*bai*bai == x){
            System.out.println("是水仙花数");
        }
        else System.out.println("不是水仙花数");
    }
}
