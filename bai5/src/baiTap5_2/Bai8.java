package baiTap5_2;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Bai8 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout1 = new FileOutputStream("D:\\f1.txt");
        FileOutputStream fout2 = new FileOutputStream("D:\\f2.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1); // viết vào file
        bout.writeTo(fout2);

        bout.flush();
        bout.close();
        System.out.println("Success..");
    }
}
