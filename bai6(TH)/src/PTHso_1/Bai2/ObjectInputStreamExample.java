package PTHso_1.Bai2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\Data.txt"));
            Student student = (Student) ois.readObject();
            System.out.println(student.toString());
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            ois.close();
        }
    }
}
