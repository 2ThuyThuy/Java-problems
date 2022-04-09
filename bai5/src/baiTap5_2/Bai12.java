package baiTap5_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Bai12 {
    public static void main(String[] args) throws IOException {
        File data = new File("D:\\testout.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String s = "Welcome to java";
        byte b[] = s.getBytes();
        file.write(b);
        file.flush();
        filter.close();
        file.close();
        System.out.println("Success...");
    }
}
