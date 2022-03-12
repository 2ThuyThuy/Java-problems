package ss1;

public class bai9 {
    // tìm tất cả các mảng nguyên (int) có tổng giá trị các phần tử bằng
    // giá trị đã cho bất kì
    // các mảng khác nhau được xem là khác số phần tử, chứ ko quan tâm đến vị trí

    private static void print(int sum, int start) {

        for(int i=start; i<= sum/2; i++) {
            System.out.printf("%d %d\n",i,sum-i);
        }

    }

    private static void solve(int n, int k) {
        if(k == 1) {
            System.out.println(n);
            return;
        }
        if(k == 2) {
            print(n, 1);
            return;
        }

    }

    public static void main(String[] args) {

        solve(7,2);
    }
}
