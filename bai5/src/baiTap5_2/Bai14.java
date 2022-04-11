package baiTap5_2;

import java.io.ObjectStreamClass;
import java.util.Calendar;

public class Bai14 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(Number.class);
        System.out.println(""+osc.getFields());
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);
        System.out.println(""+osc2.getField("hash"));
    }
}
