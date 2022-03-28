package PhieuBTSo4;

import java.util.Scanner;

public class Xe implements MayMoc  {

    private String tenXe;
    private String tenKH;
    private String NL;
    private DoanhNghiep dn = new DoanhNghiep();
    private float trongTai;
    private float tienDatCoc;
    private int namSX;

    @Override
    public void setNhienLieu(String NL) {
        this.NL = NL;
    }

    @Override
    public void setNamSX(int namSX) {
        if(namSX > 0)
            this.namSX = namSX;
        else
            this.namSX = 2016;
    }

    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten xe: ");
        tenXe = sc.nextLine();
        System.out.print("Nhap nhien lieu cua xe: ");
        setNhienLieu(sc.nextLine());
        System.out.print("Nhap ten khach hang thue xe: ");
        tenKH = sc.nextLine();
        System.out.print("Nhap doanh nghiep: ");
        dn.nhap();
        System.out.println("Nhap trong tai: ");
        trongTai = sc.nextFloat();
        System.out.print("Nhap so tien dat coc(VND): ");
        tienDatCoc = sc.nextFloat();
        System.out.print("Nam san xuat xe: ");
        setNamSX(sc.nextInt());
        sc.nextLine();
    }
    public  static void inTieuDe(){
        System.out.printf("%10s %10s %10s %25s %10s %10s %10s%n",
                "ten xe", "ten kh"," nhien lieu"," Doanh nghiep",
                " tai trọng","tien DC"," Nam sx");
    }
    public void inDL() {
        System.out.printf("%10s %10s %10s %25s %10.1f %10.1fs %10d %n",
                tenXe,tenKH,NL,dn,trongTai,tienDatCoc,namSX);
    }
    public float getTrongTai () {
        return trongTai;
    }
}
