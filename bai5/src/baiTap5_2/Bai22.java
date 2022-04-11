package baiTap5_2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bai22 {
    public static void main(String[] args) throws  Exception{
        FileWriter write = new FileWriter("D:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(write);
        buffer.write("Welcome to Thuy");
        buffer.close();
        System.out.println("Success");
    }
}
