package ss1;

import java.util.Scanner;

public class bai17 {
    // viết hoa các kí tự đầu từ trong một chuỗi
    private  static  boolean check(char c){
        if(c>='a' && c<='z')
            return true;
        return false;
    }

    private static void Words(String s){


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi: ");
        char []ch = new char[10000];
        String ss = sc.nextLine();
        Words(ss);
    }

}
