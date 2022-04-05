package BaiTap5_1.Bai1;

public class MultipleCatchBlock2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            System.out.println(a[10]);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occours");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }catch (Exception e) {
            System.out.println("ParentException occurs");
        }
        System.out.println("rest of the code");

    }
}
