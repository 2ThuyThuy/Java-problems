package baiTap5_2;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Bai30 {
    public static void main(String[] args) throws Exception{
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("JavaTpoint provides tutorials of all technology.");
        writer.flush();
        writer.close();

        PrintWriter writer1 = null;
        writer1 = new PrintWriter(new File("D:\\testout.txt"));
        writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.flush();
        writer1.close();
    }
}
