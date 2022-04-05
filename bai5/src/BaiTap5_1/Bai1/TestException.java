package BaiTap5_1.Bai1;

public class TestException {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("thuc hien phep chia");
                int b = 39/0;
            }catch (ArithmeticException e) {
                System.out.println(e); // in ra loi
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("khoi lenh khac");
        }catch (Exception e) {
            System.out.println("Xu ly ngoai le");
        }
        System.out.println("tiep tuc chuong trinh");
    }
}
