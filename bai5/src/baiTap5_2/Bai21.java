package baiTap5_2;

import java.io.FileReader;

public class Bai21 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("D:\\testout.txt");
        int i;
        while((i=fr.read())!= -1)
            System.out.print((char)i);

        fr.close();
    }
}
