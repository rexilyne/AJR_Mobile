package com.example.p3l_ajr.model;

import com.google.gson.annotations.SerializedName;

public class LaporanPenyewaanMobil {
    private String tipe_mobil;
    private String nama_mobil;
    @SerializedName("jumlah_peminjaman")
    private int jumlah;
    @SerializedName("total_pendapatan")
    private double total;

    public LaporanPenyewaanMobil(String tipe_mobil, String nama_mobil, int jumlah, double total) {
        this.setTipe_mobil(tipe_mobil);
        this.setNama_mobil(nama_mobil);
        this.setJumlah(jumlah);
        this.setTotal(total);
    }

    public String getTipe_mobil() {
        return tipe_mobil;
    }

    public void setTipe_mobil(String tipe_mobil) {
        this.tipe_mobil = tipe_mobil;
    }

    public String getNama_mobil() {
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
