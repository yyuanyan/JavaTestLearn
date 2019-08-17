package com.yy.Method;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 07 - 0:42
 */
public class BackCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the number:");
        int nums = scanner.nextInt();
        Backcode(nums);
    }
    public static void Backcode(int nums){
        int temp = nums;
        int count = 0;
        int bnums = nums;
        while (temp>0){
            temp = temp / 10;
            count++;
        }
        //System.out.println(nums);
        //System.out.println(count);
        int[] r = new int[count];
        for (int i = 0;i < count; i++) {
            r[i] = bnums % 10;
            bnums = bnums / 10;
            //System.out.println(bnums+"---"+r[i]);
        }
        int tag = 0;
        //System.out.println("--------------"+r[count-1]+"-----------"+count);
        for (int i = 0; i <= count/2; i++) {
            int j = count-i-1;
                //System.out.println(r[i]+"***********"+r[j]);
                if (r[i] == r[j])
                    tag++;

        }
        //System.out.println(tag);
        if (/*tag == count/2 ||*/ tag == count/2+1)
            System.out.println("yes,The number is the back-code");
        else System.out.println("no,the number isn't the back-code");
    }
}
