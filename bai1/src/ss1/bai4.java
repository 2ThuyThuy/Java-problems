package ss1;

import java.util.Scanner;

public class bai4 {

    private static int GT(int n) {
        int res = 1;
        for(int i=1; i<=n; i++) {
            res*=i;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        int k;
        do{
            System.out.print("Nhập k (0<=k<n): ");
            k=sc.nextInt();
        }while(k >=n);

        System.out.printf("C(n,k) = %d",GT(n)/(GT(k)*GT(n-k)));

    }
}
