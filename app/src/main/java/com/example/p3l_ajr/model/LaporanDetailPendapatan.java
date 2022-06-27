package com.example.p3l_ajr.model;

import com.google.gson.annotations.SerializedName;

public class LaporanDetailPendapatan {
    private String nama;
    private String nama_mobil;
    private String jenis_penyewaan;
    @SerializedName("jumlah_penyewaan")
    private int jumlahTransaksi;
    @SerializedName("total_pendapatan")
    private int jumlahPendapatan;

    public LaporanDetailPendapatan(String nama, String nama_mobil, String jenis_penyewaan, int jumlahTransaksi, int jumlahPendapatan) {
        this.setNama(nama);
        this.setNama_mobil(nama_mobil);
        this.setJenis_penyewaan(jenis_penyewaan);
        this.setJumlahTransaksi(jumlahTransaksi);
        this.setJumlahPendapatan(jumlahPendapatan);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama_mobil() {
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    public String getJenis_penyewaan() {
        return jenis_penyewaan;
    }

    public void setJenis_penyewaan(String jenis_penyewaan) {
        this.jenis_penyewaan = jenis_penyewaan;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public void setJumlahTransaksi(int jumlahTransaksi) {
        this.jumlahTransaksi = jumlahTransaksi;
    }

    public int getJumlahPendapatan() {
        return jumlahPendapatan;
    }

    public void setJumlahPendapatan(int jumlahPendapatan) {
        this.jumlahPendapatan = jumlahPendapatan;
    }
}
