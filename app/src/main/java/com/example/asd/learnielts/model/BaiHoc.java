package com.example.asd.learnielts.model;

/**
 * Created by asd on 11/7/2016.
 */

public class BaiHoc {

    private int maBaiHoc;
    private String tenBaiHoc;
    private String gioiThieuBaiHoc;
    private String baiOnTap;
    private boolean trangThai;

    private int maGiaoVien;

    public String getBaiOnTap() {
        return baiOnTap;
    }

    public void setBaiOnTap(String baiOnTap) {
        this.baiOnTap = baiOnTap;
    }

    public String getGioiThieuBaiHoc() {
        return gioiThieuBaiHoc;
    }

    public void setGioiThieuBaiHoc(String gioiThieuBaiHoc) {
        this.gioiThieuBaiHoc = gioiThieuBaiHoc;
    }

    public int getMaBaiHoc() {
        return maBaiHoc;
    }

    public void setMaBaiHoc(int maBaiHoc) {
        this.maBaiHoc = maBaiHoc;
    }

    public int getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(int maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getTenBaiHoc() {
        return tenBaiHoc;
    }

    public void setTenBaiHoc(String tenBaiHoc) {
        this.tenBaiHoc = tenBaiHoc;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
