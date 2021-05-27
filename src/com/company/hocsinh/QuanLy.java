package com.company.hocsinh;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLy {
    private ArrayList<HocSinh> listHS;

    public QuanLy() {
        this.listHS = new ArrayList<>();
    }

    public void addHS(HocSinh hs) {
        int pos = listHS.indexOf(hs);
        if (pos >= 0) {
            System.out.println("Err: Học sinh bị trùng tên !!!");
        }
        listHS.add(hs);
    }

    public void inDSHS() {
        System.out.println("Danh sách học sinh: ");
        for (int i = 0; i < listHS.size(); i++) {
            break;
        }
        System.out.println(listHS.toString());
    }

    public void calAgeAVG() {
        int ageAVG = 0;
        for (HocSinh hs : listHS) {
            ageAVG += hs.getTuoi();
        }
        ageAVG = ageAVG / listHS.size();
        System.out.println("Tuổi TB của học sinh: " + ageAVG);
    }

    public void printListHSAgeMin() {
        ArrayList<HocSinh> listHSMin = new ArrayList<>();
        int ageMin = listHS.get(0).getTuoi();

        for (int i = 0; i < listHS.size(); i++) {
            HocSinh hs = listHS.get(i);
            if (ageMin > hs.getTuoi()) {
                listHSMin.clear();
                ageMin = hs.getTuoi();
                listHSMin.add(hs);
            } else if (ageMin == hs.getTuoi()) {
                listHSMin.add(hs);
            }
        }
        System.out.println("DS học sinh nhỏ tuổi nhất: ");
        System.out.println(listHSMin);
    }

    public void delHSByAge(int age) {
        for (int i = 0; i < listHS.size(); i++) {
            HocSinh hs = listHS.get(i);
            if (hs.getTuoi() == age) {
                listHS.remove(i);
                //i--;
            }
        }
        System.out.println("Danh sách học sinh sau khi xóa: ");
        System.out.println(listHS);
    }

    public void sortHSByTenTD() {
        Comparator<HocSinh> tcSXTenTD = new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                return hs1.getTen().compareTo(hs2.getTen());
            }
        };
        listHS.sort(tcSXTenTD);
        System.out.println("Danh sách học sinh theo tên tăng dần: ");
        System.out.println(listHS);
    }

    public void sortHSByAgeGD() {
        Comparator<HocSinh> tcSXTuoiGD = new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                return -(hs1.getTuoi() - hs2.getTuoi());
            }
        };
        listHS.sort(tcSXTuoiGD);
        System.out.println("Danh sách học sinh theo tuổi giảm dần: ");
        System.out.println(listHS);
    }
}
