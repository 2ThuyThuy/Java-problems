package ss1;

import java.util.Scanner;

public class bai16 {
    // Đếm xem trong một chuỗi có bao nhiêu từ

    private  static  boolean check(char c){
        if((c >='A' && c<='Z') || ( c>='a' && c<='z'))
            return true;
        return false;
    }



    private static void countWords(String s){
        int res = check(s.charAt(0))? 1: 0;

        for(int i=1; i<s.length()-1; i++){
            if (s.charAt(i)==' ' && check(s.charAt(i+1)))
                res++;
        }

        System.out.println("Có "+ res+" từ trong câu trên");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi: ");
        String ss = sc.nextLine();
        countWords(ss);
    }
}
