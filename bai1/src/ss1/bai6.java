package ss1;

import java.util.Scanner;

public class bai6 {
    // chương trình kiểm tra một số có phải là số ng tố ko
    private static boolean check_prime(int n) {
        if (n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        if(check_prime(n))
            System.out.println(n+" là số nguyên tố");
        else
            System.out.println(n+" không phải là số nguyên tố");
    }
}
