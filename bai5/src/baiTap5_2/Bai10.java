package baiTap5_2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bai10 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.write(65);
        data.flush();
        data.close();
        System.out.println("Success...");
    }
}
