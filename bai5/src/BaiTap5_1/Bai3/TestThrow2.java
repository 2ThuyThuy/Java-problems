package BaiTap5_1.Bai3;

public class TestThrow2 {
    static void validate(int age){
        try {
            if(age < 8)
                throw  new ArithmeticException("Not valid");
            else
                System.out.println("welcome");
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void main(String[] args) {
        // Ném ra ngoại lệ nhưng có xử lý
        validate(7);
        System.out.println("rest of the code.. ");
    }
}
