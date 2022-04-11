package baiTap5_2;

import java.io.ObjectStreamClass;
import java.util.Calendar;

public class bai15 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
        System.out.println(""+osc.getField("value"));
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);
        System.out.println(""+osc2.getField("isTimeSet"));
    }
}
