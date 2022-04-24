/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dagiacmain;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author macair
 */
public class QuanLi{

    TreeSet<Thang> ts = new TreeSet<Thang>();

    
    public void themHinh() {
        Thang th = new Thang();
        th.nhap();
        
        if (ts.contains(th)) {
            System.out.println("Da ton tai hinh nay !  ");
        } else {
            if (ts.size() + 1 <= 5) {
                ts.add(th);
            } else {
                System.out.println("Vuot qua sl cho phep ");
            }

        }
    }

    public void inds() {
        Iterator<Thang> iterator = ts.iterator();
        System.out.printf("ds hinh : \n");

        System.out.printf("mahinh \t tenhinh \t chieu cao \t canh ");
        while (iterator.hasNext()) {
            System.out.printf(iterator.next() + "\t");
        }
    }

}
