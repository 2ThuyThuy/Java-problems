package ss1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        Long ans = 1L;
        for(int i = 1; i<=n; i++) {
            ans*=i;
        }
        System.out.println("n! = "+ans);
    }
}
