package BaiTap5_1.Bai3;

public class TestThrow1 {
    static void validate(int age){
        if(age < 8)
            throw  new ArithmeticException("Not valid");
        else
            System.out.println("welcome");
    }

    public static void main(String[] args) {
        // Ném ra ngoại lệ nhưng không xử lý

        validate(12);
        System.out.println("rest of the code.. ");
    }
}
