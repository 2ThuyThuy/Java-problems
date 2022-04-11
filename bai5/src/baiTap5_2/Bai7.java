package baiTap5_2;


import java.io.FileInputStream;

import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Bai7 {
    public static void main(String[] args) throws IOException {
        // creating the FileInputStream object for all the file
        FileInputStream fin = new FileInputStream("D:\\a.txt");
        FileInputStream fin2 = new FileInputStream("D:\\b.txt");
        FileInputStream fin3 = new FileInputStream("D:\\c.txt");
        FileInputStream fin4 = new FileInputStream("D:\\d.txt");

        Vector v = new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);

        Enumeration e = v.elements();
        SequenceInputStream bin = new SequenceInputStream(e);
        int i = 0;
        while((i = bin.read()) != -1) {
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
        fin2.close();
    }
}