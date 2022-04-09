package baiTap5_2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bai4 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            // đọc đc các byte từ mọt input file
            // đc sử dụng để đọc dữ liệu theo định dạng byte như liệu ảnh, âm thanh, video,..
            BufferedInputStream bin = new BufferedInputStream(fin);
            // được sử dụng để độc thông tin từ stream (),
            // nó có tác dụng sự dụng cơ chế đệm để tăng hiệu suất đọc
            int i;
            while((i=bin.read()) != -1) {
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
