/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dagiacmain;

import java.util.ArrayList;

public abstract class DaGiac {

    public String maHinh;
    public String tenHinh;
    public ArrayList<Integer> dsCanh = new ArrayList<Integer>();

    public int chuVi() {
        int cv = 0;
        for (int i = 0; i < dsCanh.size(); i++) {
            cv += dsCanh.get(i);
        }
        return cv;
    }

    public abstract double dienTich();

    public abstract void nhap();

    @Override
    public String toString() {
        return chuVi() + "\t" + dienTich() + "\t" +dsCanh.toString(); 
    }
    
    public void setMaHinh(String maHinh) throws Exception {
        if (maHinh.trim().equals("")) {
            throw new Exception("maHinh ko dc de trong");
        } else {
            this.maHinh = maHinh;
        }
    }

    public void setTenHinh(String tenHinh) throws Exception {
        if (tenHinh.trim().equals("")) {
            throw new Exception("tenHinh ko dc de trong");
        } else {
            this.tenHinh = tenHinh;
        }

    }
}
