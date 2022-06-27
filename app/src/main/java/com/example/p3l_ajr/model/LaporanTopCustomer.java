package com.example.p3l_ajr.model;

import com.google.gson.annotations.SerializedName;

public class LaporanTopCustomer {
    private String nama;
    @SerializedName("jumlah_penyewaan")
    private int jumlahTransaksi;

    public LaporanTopCustomer(String nama, int jumlahTransaksi) {
        this.setNama(nama);
        this.setJumlahTransaksi(jumlahTransaksi);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public void setJumlahTransaksi(int jumlahTransaksi) {
        this.jumlahTransaksi = jumlahTransaksi;
    }
}
