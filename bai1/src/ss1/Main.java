package ss1;

import java.util.Scanner;

public class Main {
    // kiểm tra n có phải là một số nguyên tố hay không
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số n: ");
        int n = sc.nextInt();
        for(int i=2; i<Math.sqrt(n); i++)
            if(n % i == 0) {
                System.out.println(n+" Không phải là số nguyên tố");
                return;
            }
        System.out.println(n+" là số nguyên tố");
    }
}
