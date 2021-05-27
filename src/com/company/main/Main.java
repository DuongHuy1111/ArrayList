package com.company.main;

import com.company.hocsinh.HocSinh;
import com.company.hocsinh.QuanLy;

public class Main {

    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        ql.addHS(new HocSinh("Huy", 26));
        ql.addHS(new HocSinh("Duong", 21));
        ql.addHS(new HocSinh("Quang", 11));
        ql.addHS(new HocSinh("Pogba", 30));
        ql.addHS(new HocSinh("Matic", 11));
        //ql.inDSHS();
        //ql.calAgeAVG();
        //ql.printListHSAgeMin();
        //ql.delHSByAge(11);
        //ql.sortHSByTenTD();
        ql.sortHSByAgeGD();
    }
}
