package ss1;

import java.util.Scanner;

public class bai17 {
    // viết hoa các kí tự đầu từ trong một chuỗi
    private  static  boolean check(char c){
        if(c>='a' && c<='z')
            return true;
        return false;
    }

    private static void Words(StringBuilder s){
        int diff ='A'-'a';
        if(check(s.charAt(0))){
            int cx = s.charAt(0)+diff;
            s.setCharAt(0,(char) cx);
        }
        for(int i=1; i<s.length()-1; i++) {
            if (s.charAt(i)==' ' && check(s.charAt(i+1))) {
                int cx = s.charAt(i+1)+diff;
                s.setCharAt(i+1,(char) cx);
            }
        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi: ");
        String ss = sc.nextLine();
        StringBuilder str = new StringBuilder(ss);
        Words(str);
    }

}
