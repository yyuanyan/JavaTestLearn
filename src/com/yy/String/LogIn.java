package com.yy.String;

import java.util.Scanner;

/**
 * @author yyuanyan
 * @create 2019 - 08 - 18 - 0:21
 */
public class LogIn {
    public static void main(String[] args) {
        String OldUsername = new String("yyuanyan");
        String OldPassword = new String("123456");
        int tag = 3; //可供错误输入的次数
        while (tag != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入账号：");
            String Username = scanner.nextLine();
            System.out.print("请输入密码：");
            String Password = scanner.nextLine();
            if (Username.equals(OldUsername) && Password.equals(OldPassword)) {
                System.out.println("登陆成功!");
                tag = 0;
            }
            else {
                System.out.println("登陆失败，请检查您的账号及密码是否正确");
                tag--;
                System.out.println("您还有" + tag + "次机会！");
            }
        }
    }
}
