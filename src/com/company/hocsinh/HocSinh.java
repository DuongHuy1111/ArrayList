package com.company.hocsinh;

import java.util.Objects;

public class HocSinh {
    private String ten;
    private int tuoi;

    public HocSinh(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HocSinh) {
            HocSinh hs2 = (HocSinh) obj;
            return ten.equals(hs2.getTen());
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten);
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
