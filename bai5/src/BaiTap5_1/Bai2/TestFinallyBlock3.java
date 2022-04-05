package BaiTap5_1.Bai2;

public class TestFinallyBlock3 {
    public static void main(String[] args) {
        // Sử dụng finnaly trong khi try có lệnh return
        try {
            int data = 25;
            if(data % 2 != 0) {
                System.out.println(data +"is old number");
                return;
            }
        }catch (ArithmeticException e) {
            System.out.println(e);
        }finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
        // thì finally sẽ vẫn luôn chạy và câu lệnh rest of code thì ko
    }
}
