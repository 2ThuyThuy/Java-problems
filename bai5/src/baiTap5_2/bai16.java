package baiTap5_2;

import java.io.Console;

public class bai16 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        /*String n = c.readLine();
        System.out.println("Welcome" + n);
         */
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);
        System.out.println("Password is: "+pass);
    }
}
