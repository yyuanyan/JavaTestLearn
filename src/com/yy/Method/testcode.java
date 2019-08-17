package com.yy.Method;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 08 - 22:34
 */
public class testcode {
    /*public static void main(String[] args) {
        String str = "成都市(成华区)(武侯区)(高新区)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);
        if(m.find()) {
            System.out.println(m.group());
        }
        //System.out.println(p.pattern());
    }*/

/*
    //java泛型
    public static <E> void printArray(E[] inputArray){
        //输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }
    public static void main(String args[]){
        //创建不同数据类型的数组
        Integer IntArray[] = {1,2,3,6,4,5};
        Double DoubleArray[] = {1.0,2.0,3.0,4.0,5.0};
        Character CharArray[] = {'H','E','L','L','O'};
        System.out.println("整型数组元素为：");
        printArray(IntArray);
        for(Integer intarray : IntArray){
            System.out.printf("%s ",intarray);
        }
    }*/


    /* public static void main(String args[]){
         Map<String, String> map = new HashMap<String, String>();
         HashMap<Integer,String> map1 = new HashMap<>();
         map.put("1","123");
         map.put("2","456");
         map1.
         System.out.println(map.keySet());
     }*/
        /*public static void main(String args[]){
            int m;
            double sum,n;
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                n=sc.nextInt();
                m=sc.nextInt();
                sum=0;
                for(int i=0;i<m;i++){
                    sum=sum+n;
                    n=Math.sqrt(n);
                }
                System.out.printf("%.2f",sum);
                System.out.println();
            }
        }*/
    public static void main(String args[]) {
          /* // public static void main(String args[]){
                Scanner sc1 = new Scanner(System.in);
                Scanner sc2 = new Scanner(System.in);
                int n = sc1.nextInt();
                String[] str = sc2.nextLine().split(" ");
                int result = 1000;
                int [] value = new int [n];
                int tag = 0;
                int temp = 0;
                int flag = 0;
                for(int i = 0;i<n;i++){
                    value[i] = Integer.parseInt(str[i]);
                }
                for(int i = 0;i<n-1;i++){
                    temp = value[i+1]-value[i];
                    if(temp<0){
                        temp = -temp;
                    }
                    if(temp<result){
                        result = temp;
                        tag = i;
                    }
                    if (temp == result){
                        continue;
                    }
                }
                System.out.print(value[tag]+" "+value[tag+1]);*/
        // public static void main(String args[]){
                /*Scanner sc1 = new Scanner(System.in);
                Scanner sc2 = new Scanner(System.in);
                int n = sc1.nextInt();
                int [] value = new int [n];
                int result = 1;
                for(int i = 0;i<n;i++){
                    value[i] = sc2.nextInt();
                }
                for(int i = 0;i<n-1;i++){
                    if(value[i]<value[i+1]){
                        result++;
                    }
                }
            System.out.println(result);*/
            /*Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            int n = sc1.nextInt();
            sc1.hasNext();
            String[] str = sc2.nextLine().split(" ");
            float [] value = new float [n];
            for(int i = 0;i<n;i++){
                value[i] = Integer.parseInt(str[i]);
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (value[j]>=value[i]*0.9){
                        result++;
                    }
                }
            }
            System.out.println(result);*/
        /*Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n = sc.nextInt();
            int m = sc.nextInt();
            String[] str = sc.nextLine().split(" ");
            float [] value = new float [(int) n];
            double sum = 0;
            for (int i = 0; i < n; i++) {
                value[i] = Integer.parseInt(str[i]);
            }
            *//*for (int i = 0; i < m; i++) {
                sum = sum + n;
                n = Math.sqrt(n);
            }*//*
            System.out.printf("%.2f", sum);
            //System.out.println();
        }*/
        System.out.println("请输入若干单词，以空格作为分隔");
        Scanner sc = new Scanner(System.in);
        String[] value = new String [5];
        while(!sc.hasNext("end"))
        {
            //int n = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                value[i] = sc.next();
            }
            /*System.out.println("键盘输入的内容是："
                    + sc.next());*/
            for (int i = 0; i < value.length; i++) {
                System.out.println("数组内容："+value[i]);
            }
        }

        System.out.println("执行吗");
    }
}



