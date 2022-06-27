package com.example.p3l_ajr.response;

import com.example.p3l_ajr.model.LaporanPenyewaanMobil;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LaporanPenyewaanMobilResponse {
    private String message;
    @SerializedName("data")
    private List<LaporanPenyewaanMobil> transaksiJoinMobilList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<LaporanPenyewaanMobil> getLaporanPenyewaanMobilList() {
        return transaksiJoinMobilList;
    }

    public void setLaporanPenyewaanMobilList(List<LaporanPenyewaanMobil> transaksiJoinMobilList) {
        this.transaksiJoinMobilList = transaksiJoinMobilList;
    }
}
