package baiTap5_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Bai18 {
    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("output.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
