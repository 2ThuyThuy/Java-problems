package ss1;

import java.util.Scanner;

public class bai10 {
    private static boolean check_prime(int n) {
        if (n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n % i == 0)
                return false;

        return true;
    }

    private static void insert(int a[], int k, int id) {
        for(int i=id-1; i>=0; i-- ) {
            //a[id]=
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        int []a = new int[n+1];
        for(int i=0; i<n; i++) {
            System.out.printf("a[%d]=", i);
            a[i] = sc.nextInt();
        }



    }
}
