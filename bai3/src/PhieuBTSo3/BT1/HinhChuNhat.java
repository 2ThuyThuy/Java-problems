package PhieuBTSo3.BT1;

public class HinhChuNhat extends HinhPhang
{
    @Override
    public double tinhDienTich() {
        return canh.get(0)* canh.get(1);
    }

    @Override
    public double tinhChuVi() {
        return (canh.get(0)+ canh.get(1))*2;
    }
}
