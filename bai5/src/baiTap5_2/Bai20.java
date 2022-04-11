package baiTap5_2;

import java.io.FileWriter;

public class Bai20 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("D:\\testout.txt");
            fw.write("Welcome to javaTpoint.");
            fw.close();
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Success...");
        }
    }
}
