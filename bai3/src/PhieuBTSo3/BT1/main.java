package PhieuBTSo3.BT1;

public class main {

    public static void main(String[] args) {
        HinhTron htron = new HinhTron();
        htron.canh.add(12.0); // nhap du lieu
        System.out.println(htron.tinhChuVi());
        System.out.println(htron.tinhDienTich());

    }
}
