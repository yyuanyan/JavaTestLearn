package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 05 - 1:28
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        consoleText(string);
    }
    public static void consoleText(String str){
        int i = 0;
        while(i<10){
            System.out.println(str);
        }
    }
}
