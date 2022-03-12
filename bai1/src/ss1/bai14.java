package ss1;

import java.util.Scanner;

public class bai14 {

    private static void countChar(String s) {
        int res[] = new int[256];
        for (int i=0; i< s.length(); i++)
            res[s.charAt(i)]++;

        for(int i=0; i<256; i++) {
            if(res[i] >0) {
                System.out.println("Kí tự \""+(char) i+"\" xuất hiện "+res[i]);
            }
        }


    }

    public static void main(String[] args) {
        // đếm số lượng các kí tự khác nhau có trong một chuỗi
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi: ");
        String ss = sc.nextLine();
        countChar(ss);
    }
}
