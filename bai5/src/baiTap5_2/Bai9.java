package baiTap5_2;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Bai9 {
    public static void main(String[] args) throws IOException {
        byte[] buf = {35, 36, 37, 38};
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1 ) {
            char ch = (char) k;
            System.out.println("ASCII value of Charcater is: "+k+"; Special chracter is: "+ ch);
        }
    }
}
