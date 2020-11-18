package com.example.zero.model;

public class NguoiChoi {
    private int thuTu;
    private String ten;
    private double diem;
    private int thuTuCauHoi;


    public NguoiChoi() {
    }

    public NguoiChoi(int thuTu, String ten, double diem, int thuTuCauHoi) {
        this.thuTu = thuTu;
        this.ten = ten;
        this.diem = diem;
        this.thuTuCauHoi = thuTuCauHoi;

    }

    public int getThuTu() {
        return thuTu;
    }

    public void setThuTu(int thuTu) {
        this.thuTu = thuTu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getThuTuCauHoi() {
        return thuTuCauHoi;
    }

    public void setThuTuCauHoi(int thuTuCauHoi) {
        this.thuTuCauHoi = thuTuCauHoi;
    }

}
