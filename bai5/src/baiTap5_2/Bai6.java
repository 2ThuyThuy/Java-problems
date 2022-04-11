package baiTap5_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Bai6 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin1 = new FileInputStream("D:\\testin1.txt");
        FileInputStream fin2 = new FileInputStream("D:\\testin2.txt");
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");

        SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
        // ghi nội dung của 2 file vào trong này
        int i;
        while((i=sis.read()) != -1) {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
}