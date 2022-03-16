package ss1;

public class bai11 {
    private static boolean check_prime(int n) {
        if (n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n % i == 0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        int [][]a = {{2,3,5,6},{4,10,3,2}};

        int ma = -1;
        for(int []u : a)
            for(int v : u)
                if(check_prime(v)) {
                    ma = Math.max(v,ma);
                }
        if(ma >1)
            System.out.println("Phan tu nguyen to lon nhat la: "+ma);
        else
            System.out.println("Khon co so nguyen to");
    }
}
