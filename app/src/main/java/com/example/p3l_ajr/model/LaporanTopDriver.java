package com.example.p3l_ajr.model;

import com.google.gson.annotations.SerializedName;

public class LaporanTopDriver {
    private String nama;
    @SerializedName("driver_id")
    private String id_driver;
    @SerializedName("jumlah_penyewaan")
    private int jumlahTransaksi;

    public LaporanTopDriver(String nama, String id_driver, int jumlahTransaksi) {
        this.setNama(nama);
        this.setId_driver(id_driver);
        this.setJumlahTransaksi(jumlahTransaksi);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId_driver() {
        return id_driver;
    }

    public void setId_driver(String id_driver) {
        this.id_driver = id_driver;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public void setJumlahTransaksi(int jumlahTransaksi) {
        this.jumlahTransaksi = jumlahTransaksi;
    }
}
