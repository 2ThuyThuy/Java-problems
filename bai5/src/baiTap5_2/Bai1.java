package baiTap5_2;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Bai1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            // tạo đối tượng file in ra, ở ổ D:
            String s = "Wellcome to javaTPoint.";
            byte b[]=s.getBytes(); // chuyển String về mảng byte
            //System.out.println(b);
            fout.write(b); // viết vào tệp
            fout.close(); // đóng tệp
            System.out.println("success");
        }catch (Exception e) {
            System.out.println(e); // lỗi gì thì in ra lỗi đấy
        }
    }
}
