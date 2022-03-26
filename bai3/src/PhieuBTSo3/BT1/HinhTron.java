package PhieuBTSo3.BT1;

public class HinhTron extends  HinhPhang{
    @Override
    public double tinhDienTich() {
        return canh.get(0)*canh.get(0)*Math.PI; // bán kính
    }

    @Override
    public double tinhChuVi() {
        return canh.get(0)*2*Math.PI;
    }
}
