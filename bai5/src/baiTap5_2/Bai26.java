package baiTap5_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai26 {
    public static void main(String[] args) throws Exception{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String name ="";
        while (!name.equals("stop")) {
            System.out.println("Enter data: ");
            name = br.readLine();
            System.out.println("data is: "+name);
        }
    }
}
