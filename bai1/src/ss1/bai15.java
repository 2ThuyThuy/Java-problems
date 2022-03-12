package ss1;

import java.util.Scanner;

public class bai15 {
    // tìm ký tự có tầng suất lớn nhất trong một chuỗi.


    private static void countMaxChar(String s) {
        int res[] = new int[256];
        int ma=0;
        for (int i=0; i< s.length(); i++){
            res[s.charAt(i)]++;
            ma=Math.max(res[s.charAt(i)],ma);
        }

        for(int i=0; i<256; i++) {
            if(res[i] == ma) {
                System.out.println("Kí tự \""+(char) i+"\" xuất hiện nhiều nhất ");
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi: ");
        String ss = sc.nextLine();
        countMaxChar(ss);
    }
}
