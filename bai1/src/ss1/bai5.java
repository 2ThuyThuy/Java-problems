package ss1;

import java.util.Scanner;

public class bai5 {
    private static int UCLN(int a, int b){
        if (b == 0) return a;
        if (a % b == 0) return b;
        return UCLN(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("UCLN(a,b)="+UCLN(a,b));

    }
}
