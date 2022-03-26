package PhieuBTSo2.BT1;

import java.util.Scanner;

public class NgayThang {
    private int thang;
    private int ngay;
    private int nam;

    public String toString(){
        return  thang + "/" + ngay + "/" + nam;
    }
    public void nhap(){
        System.out.print("Ngay, thang, nam: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int nam = sc.nextInt();
    }
    public void kiemTra(int ngay1, int thang1, int nam1){
        if(thang1 > 0 && thang1 <=12)
            this.thang = thang1;
        else {
            this.thang=1;
            System.out.println("Thang" + thang1+" khong hop le/ dat lai thang = 1.");
        }
        nam = nam1;
        ngay=checkDay(ngay1);
    }
    private int checkDay(int ngayKiemTra) {
        int ngayTrongThang[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(ngayKiemTra > 0 && ngayKiemTra <= ngayTrongThang[thang])
            return ngayKiemTra;
        else if ((thang == 2 && ngayKiemTra == 29) && ((nam % 400 == 0) || ((nam % 4 == 0) && (nam % 100!= 0 ))))
            return ngayKiemTra;
        else
            System.out.println("Ngay "+ngayKiemTra+" khon hop le, dat lai =1.");
            return 1;
    }

}
