package baiTap5_2;

import java.io.CharArrayReader;

public class Bai27 {
    public static void main(String[] args) throws Exception {
        char[] ary = {'T', 'h', 'u','y'};
        CharArrayReader reader = new CharArrayReader(ary);
        int k =0;
        while((k = reader.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }
}
