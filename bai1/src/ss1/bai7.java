package ss1;

import java.util.Arrays;
import java.util.Scanner;

public class bai7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++) {
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.printf("mảng sau khi sắp xếp a[]: %s\n",Arrays.toString(a));

        System.out.printf("Nhập phần tử muốn tìm kiếm:");
        int k = sc.nextInt();

        int l=0,r=n-1;
        while (l<=r) {
            int m = (l+r)/2;
            if(a[m] == k) {
                System.out.println(k + " ở vị trí thứ " + m);
                return;
            } else if(a[m] <= k )
                l=m+1;
            else
                r=m-1;

        }
        System.out.println("Không tìm thấy "+k);

    }
}
