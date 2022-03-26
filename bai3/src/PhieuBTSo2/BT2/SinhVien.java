package PhieuBTSo2.BT2;

import java.util.*;
import java.util.stream.Collectors;

public class SinhVien {
    static String hoTen;
    static Date ngaySinh;
    static int soMon;
    static List<Mon> monHoc;

    static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        ngaySinh = new Date();
        ngaySinh.nhap();
        System.out.print("So mon: ");
        soMon = sc.nextInt();
        monHoc = new ArrayList<>();
        for(int i=0; i<soMon; i++) {
            System.out.println("Thong tin mon hoc thu: "+(i+1));
            Mon themMonHoc = new Mon();
            themMonHoc.nhap();
            monHoc.add(themMonHoc);
        }

    }
    static void xuat() {
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Ngay sinh:" + ngaySinh.toString());
        Mon.inTT();
        System.out.printf("%10s %n","Diem");
        int i=0;
        for(Mon motMon : monHoc){
            motMon.xuat();
        }
    }


    public static void main(String[] args) {
        // do có một điểm ko thể sắp xếp được nên phải chuyển thuộc tính điểm thi từ class SinhVien sang class Mon
        // thì mới sắp xếp được
        nhap();
        monHoc.sort(new Comparator<Mon>() {
            @Override // ghi đè cái phương thức có sẵn trong sort để sắp xếp theo điểm thi á
            public int compare(Mon o1, Mon o2) {
                return (int) (o1.getDiemThi() - o2.getDiemThi());
            }
        });
        xuat();

        //monHoc = monHoc.stream().sorted().collect(Collectors.toList());
        // :(
        // stream : chuyển sang stream, stream là api của java 8
        // trong stream có một method sorted(), mặc định là sắp xếp tăng dầnm
        // và dùng cái hàm equals để so sánh hai MonHoc với nhau
        // collect(Collectors.toList()): chuyển stream về mảng, và sẽ trả về ds mới

    }

}
