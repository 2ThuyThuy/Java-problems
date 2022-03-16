package ss1;


import java.util.Scanner;

public class bai2 {
    //giải phương trình bậc 2 có tính tới nghiệm phức
    public static void main(String[] args) {
        System.out.println("Nhập các hệ số của phương trình: a*x^2 + b*x+c=0");
        Scanner  sc = new Scanner(System.in);
        System.out.printf("Nhập hệ số a: ");
        float a = sc.nextFloat();
        System.out.printf("Nhập hệ số b: ");
        float b = sc.nextFloat();
        System.out.printf("Nhập hệ số c: ");
        float c = sc.nextFloat();

        float delta = b*b - 4*a*c;
        if(delta == 0) {
            float ans = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x1=x2="+ans);
        }else if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệp phân biệt x1="+x1+" x2="+x2);
        }else {
            double first = b/(2*a);
            delta = Math.abs(delta);
            double second = Math.sqrt(delta)/(2*a);
            System.out.printf("Phương trình có 2 nghiệm phân biệt x1=%f+i%f ; x2=%f-i%f",first,second,first,second);

        }

    }
}
