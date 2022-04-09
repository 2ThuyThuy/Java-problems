package baiTap5_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Bai5 {
    public static void main(String[] args) throws Exception {
        FileInputStream input1 = new FileInputStream("D:\\testin.txt");
        FileInputStream input2 = new FileInputStream("D:\\testout.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        // SequenceInputStream cho phép chúng ta đọc kết hợp nhiều InputStream và độc từng InputStream theo thứ tự
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
