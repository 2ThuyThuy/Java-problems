package PTHso_1.Bai2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\Data.txt"));
            Student student = new Student(1,"Tran Hao Phong", "Ha Noi", 17);
            oos.writeObject(student);

            System.out.println("Susscess");
        }catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            oos.close();
        }
    }
}
