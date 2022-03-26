package PhieuBTSo3.BT1;

public class HinhVuong extends HinhPhang{
    // extends là kế thừa đó
    @Override
    public double tinhDienTich() {
        return canh.get(0)*canh.get(0);
    }

    @Override
    public double tinhChuVi() {
        return canh.get(0)*4;
    }
}
