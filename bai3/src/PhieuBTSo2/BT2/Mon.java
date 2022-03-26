package PhieuBTSo2.BT2;

import java.util.Scanner;

public class Mon {
    private String tenMon;
    private int soHocTrinh;
    private String hocKy;
    private Float diemThi;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten mon: ");
        tenMon = sc.nextLine();
        System.out.print("So hoc trinh: ");
        soHocTrinh = sc.nextInt();
        System.out.print("Hoc ky: ");
        sc.nextLine();
        hocKy = sc.nextLine();
        System.out.print("Diem thi: ");
        diemThi = sc.nextFloat();
    }
   /* khum dùng
    @Override // java đã có sẵn class object, bây h mình Override(ghi đè) thì sẽ dùng tg này để mang đi so sánh
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mon mon = (Mon) o;
        return mon.diemThi ==  diemThi; // và chỉ so sánh mỗi điểm thi,
        // ngoài ra có thể so sánh nhiều thuộc tính khác
    }*/

    static void inTT(){
        System.out.printf("%20s %15s %20s %15s %n","Mon","So hoc Trinh","Hoc Ki","Diem Thi");
    }
    public void xuat(){
        System.out.printf("%20s %15s %20s %15.2f %n",tenMon,soHocTrinh,hocKy,diemThi);
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoHocTrinh() {
        return soHocTrinh;
    }

    public void setSoHocTrinh(int soHocTrinh) {
        this.soHocTrinh = soHocTrinh;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public Float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(Float diemThi) {
        this.diemThi = diemThi;
    }
}
