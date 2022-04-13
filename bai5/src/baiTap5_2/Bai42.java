package baiTap5_2;

import java.io.File;

public class Bai42 {
    public static void main(String[] args) {
        File f=new File("/Users/sonoojaiswal/Documents");
        String filenames[]=f.list();
        for(String filename:filenames){
            System.out.println(filename);
        }
    }
}
