package ss1;

import java.util.Scanner;

public class bai19 {
    // viết chương trình cắt ra một số lượng từ nhất định trong một chuỗi đã cho

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi a: ");
        String a = sc.nextLine();
        System.out.printf("Nhập vị trí bắt đầu: ");
        int k = sc.nextInt();
        System.out.printf("Nhập số kí tự: ");
        int d = sc.nextInt();
        if(k+d > a.length()){
            System.out.println("Số không hợp lệ");
            return;
        }

        String ans = a.substring(k,k+d);
        System.out.println("Chuỗi sau khi cắt: "+ans);
    }

}
