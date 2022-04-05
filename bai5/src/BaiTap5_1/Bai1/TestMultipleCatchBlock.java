package BaiTap5_1.Bai1;

public class TestMultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30/0;
        } catch(ArithmeticException e) { // xay ra khi chia cho 0
            System.out.println("task 1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) { // xay ra khi gia tri vao index sai
            System.out.println("task 2 completed");
        } catch (Exception e) { // cac loi khac
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");
    }
}
