package BaiTap5_1.Bai1;

public class MultipleCatchBlock4 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }catch (ArithmeticException e) { // chia 0
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e) { // index loi
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (Exception e) { // loi khac
            System.out.println("ParentException occurs");
        }
        System.out.println("rest of the code");
    }
}
