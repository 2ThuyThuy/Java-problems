package PTHso_1.Bai2;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String names;
    private String address;
    private int age;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Student(int id, String names, String address, int age) {
        this.id = id;
        this.names = names;
        this.address = address;
        this.age = age;
    }
    public Student() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student@[id" + id + ", names='" + names  + ", address='" + address +
                ", age=" + age + ']';
    }
}
