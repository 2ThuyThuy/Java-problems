package ss1;

import java.util.Scanner;

public class bai9 {
    // tìm tất cả các mảng nguyên (int) có tổng giá trị các phần tử bằng
    // giá trị đã cho bất kì
    // các mảng khác nhau được xem là khác số phần tử, chứ ko quan tâm đến vị trí

    private static void print(int sum, int start, int a[], int m) {
        for(int i=start; i<= sum/2; i++) {
            for(int j=0; j<m; j++)
                System.out.printf("%d ",a[j]);
            System.out.printf("%d %d\n",i,sum-i);
        }
    }

    private static void solve(int n, int k) {
        if(k == 1) {
            System.out.println(n);
            return;
        }
        if(k == 2) {
            for(int i=1; i<= n/2; i++)
                System.out.printf("%d %d\n",i,n-i);
            return;
        }
        int m = k-2,sum=n-m,first=m;
        int []a = new int[m];
        for(int i=0; i<m; i++) {
            a[i]=1;
        }
        int i=m-1;
        while (first+2*a[m-1] <= n) {
            print(sum,a[i],a,m);
            a[i]++;
            first++;
            sum--;
            i--;
            if(i == -1) i=m-1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("Các mảng có tổng bằng n và số phần tử bé thua hoặc bằng n là:");
        for(int i=1; i<=n; i++){
            solve(n,i);
        }
    }
}
