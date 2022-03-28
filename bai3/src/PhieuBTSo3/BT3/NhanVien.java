package PhieuBTSo3.BT3;

import java.util.Scanner;

public abstract class NhanVien {
    protected String hoTen;
    protected int namVaoLam;
    protected long phuCap = 100000l;

    public abstract Long luong();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen= sc.nextLine();
        System.out.print("Năm vào làm: ");
        namVaoLam = sc.nextInt();
    }

    public Long tongTien() {
        return luong()+phuCap;
    }
}
