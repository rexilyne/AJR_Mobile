package com.example.p3l_ajr.response;

import com.example.p3l_ajr.model.LaporanTopCustomer;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LaporanTopCustomerResponse {
    private String message;
    @SerializedName("data")
    private List<LaporanTopCustomer> transaksiJoinCustomerList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<LaporanTopCustomer> getLaporanTopCustomerList() {
        return transaksiJoinCustomerList;
    }

    public void setLaporanTopCustomerList(List<LaporanTopCustomer> transaksiJoinCustomerList) {
        this.transaksiJoinCustomerList = transaksiJoinCustomerList;
    }
}
