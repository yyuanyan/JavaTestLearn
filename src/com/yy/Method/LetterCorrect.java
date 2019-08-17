package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 07 - 20:35
 */



public class LetterCorrect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());         //将字符串转换为int值
            for(int i = 0; i < n; i++){
                StringBuilder sb = new StringBuilder(sc.nextLine());
                for(int j = 2; j < sb.length(); j++){
                    //三个相邻字符相等
                    if(sb.charAt(j) == sb.charAt(j - 1) && sb.charAt(j - 1) == sb.charAt(j - 2)){
                        sb.deleteCharAt(j);
                        j--;
                    }
                    else if(isPattern(sb,
                            j - 3, j)){
                        sb.deleteCharAt(j);
                        j--;
                    }

                }
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
    public static boolean isPattern(StringBuilder sb, int i, int j){
        if(i < 0) return false;
        return sb.charAt(i) == sb.charAt(i + 1) &&
                sb.charAt(j - 1) == sb.charAt(j);
    }
}
