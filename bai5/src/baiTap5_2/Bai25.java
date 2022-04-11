package baiTap5_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai25 {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.print(br);
        System.out.println();
        System.out.println("Welcome "+ name);
    }
}
