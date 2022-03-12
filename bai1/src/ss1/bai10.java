package ss1;

import java.util.Arrays;
import java.util.Scanner;

public class bai10 {
    private static boolean check_prime(int n) {
        if (n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n % i == 0)
                return false;

        return true;
    }

    private static void swap(int a[], int k, int id) {
        if(id == 0) return;
        for(int i=id; i>0; i-- )
            a[i]=a[i-1];
        a[0]=k;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++) {
            System.out.printf("a[%d]=", i);
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0; i<n; i++) {
            if(check_prime(a[i])){
                count++;
                swap(a,a[i],i);
            }
        }
        Arrays.sort(a,0,count);

        System.out.printf("mảng sau khi đưa số nguyên tố lên đầu là: %s", Arrays.toString(a));
    }
}
