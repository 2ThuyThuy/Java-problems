package ss1;

public class bai11 {
    public static void main(String[] args) {
        int [][]a = {{2,3,5,6},{4,10,3,2}};

        int ma = a[0][0];
        for(int []u : a)
            for(int v : u)
                ma = Math.max(v,ma);

        System.out.println("Phan tu lon nhat la: "+ma);
    }
}
