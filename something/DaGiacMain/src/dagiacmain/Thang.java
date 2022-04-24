/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dagiacmain;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macair
 */
public class Thang extends DaGiac {

    public int chieuCao;

    @Override
    public double dienTich() {
        return 1.0;
    }
    public Thang(String mahinh) {
        maHinh = mahinh;
    }
     public Thang() {
        maHinh = "mh1";
        tenHinh = "th1";
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        try {
            chieuCao = rand.nextInt(12) + 1;
          
            System.out.printf("Nhập ma hinh : \n");
            setMaHinh(sc.nextLine());
            System.out.printf("Nhập ten hinh : \n");
            setTenHinh(sc.nextLine());
            
            do {
                for (int i = 0; i < 4; ++i) {
                    dsCanh.add(rand.nextInt(12) + 1);

                }
            } while (dsCanh.get(0) + dsCanh.get(1) <= dsCanh.get(2) || (dsCanh.get(1) + dsCanh.get(2)) <= dsCanh.get(0) || (dsCanh.get(0) + dsCanh.get(2)) <= dsCanh.get(1));

        } catch (Exception ex) {
            System.out.print("lỗi : " + ex.toString());
        }
    }
}
