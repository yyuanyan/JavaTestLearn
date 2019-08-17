package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 07 - 0:33
 */
public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("请输入月份：");
        int season = scanner.nextInt();
        ReturnSeason(season);
    }
    public static void ReturnSeason(int season){
        if(season>=3&&season<=5)
            System.out.println("春天");
        else if(season>=6&&season<=8)
            System.out.println("夏天");
        else if(season>=9&&season<=11)
            System.out.println("秋天");
        else if(season==12&&season>=1&&season<=2)
            System.out.println("冬天");
    }
}
