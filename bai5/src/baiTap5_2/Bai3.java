package baiTap5_2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Bai3 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt"); // tạo đối tượng file output
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        // BufferedOutputStream là một lớp con của OutputStream, được sử dụng để đơn giản hóa
        // việc ghi văn bản vào một luồng đầu ra nhị phân (binary output stream), và nâng cao hiệu suất của chương trình
        String s = "Welcome to javaTPoint";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
