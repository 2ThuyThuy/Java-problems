package ss1;

import java.util.Scanner;

public class bai12 {
    // Nhân ma trận A[m][n] X B[n][p] = C[m][p]
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("m =");
        int m = sc.nextInt();
        System.out.printf("n= ");
        int n = sc.nextInt();
        int [][]A = new int[m][n];
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++) {
                System.out.printf("A[%d][%d]=",i,j);
                A[i][j]=sc.nextInt();
            }

        System.out.printf("p =");
        int p = sc.nextInt();
        int [][]B = new int[n][p];
        for(int i=0; i<n; i++)
            for(int j=0; j<p; j++) {
                System.out.printf("B[%d][%d]=",i,j);
                B[i][j]=sc.nextInt();
            }

        int [][]C = new int[m][p];

        for(int k=0; k<m; k++)
            for(int i=0; i<p; i++) {
                int res = 0;
                for(int j=0; j<n; j++)
                    res += A[k][j]*B[j][i];
                C[k][i]=res;
            }
        System.out.println("ma tran C: ");
        for(int []v: C){
            for(int u : v)
                System.out.printf("%d ",u);
            System.out.println();
        }

    }
}
