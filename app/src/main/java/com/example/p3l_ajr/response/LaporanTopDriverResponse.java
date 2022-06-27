package com.example.p3l_ajr.response;

import com.example.p3l_ajr.model.LaporanTopDriver;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LaporanTopDriverResponse {
    private String message;
    @SerializedName("data")
    private List<LaporanTopDriver> transaksiJoinDriverList;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<LaporanTopDriver> getLaporanTopDriverList() {
        return transaksiJoinDriverList;
    }

    public void setLaporanTopDriverList(List<LaporanTopDriver> transaksiJoinDriverList) {
        this.transaksiJoinDriverList = transaksiJoinDriverList;
    }
}
