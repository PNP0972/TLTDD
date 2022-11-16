package com.example.baitapkt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SingerActivity extends AppCompatActivity {
    private  int hinhAnh;
    private  String ten;
    private  String ngheDanh;
    private  String quocGia;
    private  String soSaoBinhChon;

    public SingerActivity(int hinhAnh, String ten, String ngheDanh, String quocGia, String soSaoBinhChon) {
        this.hinhAnh = hinhAnh;
        this.ten = ten;
        this.ngheDanh = ngheDanh;
        this.quocGia = quocGia;
        this.soSaoBinhChon = soSaoBinhChon;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getSoSaoBinhChon() {
        return soSaoBinhChon;
    }

    public void setSoSaoBinhChon(String soSaoBinhChon) {
        this.soSaoBinhChon = soSaoBinhChon;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singer);
    }
}