package ss1;

import java.util.Scanner;

public class bai18 {
    // Viết chương trình so sánh sự giống nhau của hai chuỗi kí tự
    // bất kì
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.printf("Nhập chuỗi b: ");
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("hai chuỗi giống nhau ");
        }else {
            System.out.println("Hai chuỗi khác nhau");
        }

    }

}
