package BaiTap5_1.Bai4;

import java.io.IOException;

public class TestThrows1 {
    // ví dụ phương thức dùng throws ném trả về ngoại lệ checked

    void m() throws IOException{
        throw  new IOException("Loi thiet bi"); // checked exception

    }

    void n() throws IOException {
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e) {
            System.out.println("ngoai le duoc xy ly");
        }
    }

    public static void main(String[] args) {
        TestThrows1 obj = new TestThrows1();
        obj.p();
        System.out.println("luong binh thuong");
    }
}
