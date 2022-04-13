package PTHso_1.Bai3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class QuanLySV {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf;
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1,"Nguyen Van A", "Ha Noi", 22));
        listStudent.add(new Student(2,"Nguyen Van B", "Nghe An", 22));
        listStudent.add(new Student(3,"Nguyen Van C", "Hai Duong", 22));

        try {
            raf = new RandomAccessFile("D:\\random.txt","rw");

        }catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        for(Student student : listStudent){
            try {
                raf.writeInt(student.getId());
                raf.writeUTF(student.getName());
                raf.writeUTF(student.getAddress());
                raf.writeInt(student.getAge());
            }catch (IOException e){
                e.printStackTrace();
                return;
            }
        }

        try{
            System.out.println("Read all: ");
            Student student = new Student();
            raf.seek(11*0);
            student.setId(raf.readInt());
            System.out.println(student.getId());
            raf.seek(11*1);
            student.setName(raf.readUTF());
            System.out.println(student.getName());
            /*
            for(int i=0; i<listStudent.size(); i++) {
                raf.seek(11*i);
                student.setId(raf.readInt());
                System.out.println(student.getId());
                raf.seek(11*i+1);
                student.setName(raf.readUTF());
                System.out.println(student.getName());
                raf.seek(11*i+2);
                student.setAddress(raf.readUTF());
                raf.seek(11*i+3);
                student.setAge(raf.readInt());
                student.toString();
            }
             */
        }catch (IOException e) {
            System.out.println("Error seeking or reading.");
        }
    }
}
