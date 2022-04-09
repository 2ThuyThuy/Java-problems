package baiTap5_2;

import java.io.FileInputStream;


public class Bai2 {

    public static void bai2_1() {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = fin.read(); // đọc số đầu tiên
            System.out.println((char)i); // chuyển số byte về i
            fin.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

    }
}
