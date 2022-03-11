package ss1;

import java.util.Arrays;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        int []a = new int[n+1];
        for(int i=0; i<n; i++) {
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
        System.out.printf("Nhập phần tử muốn muốn chèn: ");
        int k = sc.nextInt();
        if(k >=n) {
            a[n]=k;
            n++;
        }else {
            for(int i=0; i<n; i++){
                if( k<a[i]) {
                    for(int j=n-1; j>=i; j--)
                        a[j+1]=a[j];
                    a[i]=k;
                    n++;
                    break;
                }
            }
        }
        System.out.printf("mảng sau khi chèn: %s\n",Arrays.toString(a));
    }
}
