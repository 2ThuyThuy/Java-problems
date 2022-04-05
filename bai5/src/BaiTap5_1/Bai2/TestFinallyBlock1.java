package BaiTap5_1.Bai2;

public class TestFinallyBlock1 {
    // Sử dụng finally khi ngaoị lệ xảy ra nhưng không xử lý
    public static void main(String[] args) {
        try {
            int data = 25/0;
            System.out.println(data);
        }catch (NullPointerException e) {
            System.out.println(e);
        }finally {
            System.out.println("finally block is always executed");

        }
        // ko co catch xu ly chia cho 0, chương trình dừng nhưng finally vẫn chạy
        System.out.println("rest of the code...");
    }
}
