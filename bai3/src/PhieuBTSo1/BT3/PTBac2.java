package PhieuBTSo1.BT3;

import java.util.Random;

public class PTBac2 {
    private double a,b,c;

     void nhap() {
        Random random = new Random();
        a = random.nextFloat()+100;
        b = random.nextFloat()+111;
        c = random.nextFloat()+10;
    }
    public void tinhNghiem() {
        double delta = b*b - 4*a*c;
        if (delta < 0) System.out.println("Phuong trinh vo nhiem");
        else if (delta == 0) System.out.println("Phuong tring co nghiem x1=x2="+(-b/(2*a)));
        else {
            System.out.printf("Phuong trinh co hai nghiem x1=%15.4f, x2=%15.4f",(-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a) );
        }
    }

    public static void main(String[] args) {
        PTBac2 pt = new PTBac2();
        pt.nhap();
        pt.tinhNghiem();
    }
}
