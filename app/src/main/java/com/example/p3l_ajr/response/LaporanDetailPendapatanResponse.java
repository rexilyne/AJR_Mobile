package com.example.p3l_ajr.response;

import com.example.p3l_ajr.model.LaporanDetailPendapatan;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LaporanDetailPendapatanResponse {
    private String message;
    @SerializedName("data")
    private List<LaporanDetailPendapatan> pendapatanList;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<LaporanDetailPendapatan> getLaporanDetailPendapatanList() {
        return pendapatanList;
    }

    public void setLaporanDetailPendapatanList(List<LaporanDetailPendapatan> pendapatanList) {
        this.pendapatanList = pendapatanList;
    }
}
