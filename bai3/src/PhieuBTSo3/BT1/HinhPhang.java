package PhieuBTSo3.BT1;

import java.util.ArrayList;
import java.util.List;

public abstract class HinhPhang {
    // abstract có thể ghi ghi đè lại  những method
    protected List<Double> canh = new ArrayList<>();
    public abstract double tinhDienTich(); // chỉ tạo thui
    public abstract double tinhChuVi();
}
