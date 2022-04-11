package baiTap5_2;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Bai29 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        PrintStream pout = new PrintStream(fout);
        pout.println(2022);
        pout.println("Hello hehe");
        pout.println("Welcome to my house");
        pout.close();
        fout.close();
        System.out.println("Success?");
    }
}
