package com.example.p3l_ajr.response;

import com.example.p3l_ajr.model.LaporanPerformaDriver;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LaporanPerformaDriverResponse {
    private String message;
    @SerializedName("data")
    private List<LaporanPerformaDriver> performaDriverList;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<LaporanPerformaDriver> getLaporanPerformaDriverList() {
        return performaDriverList;
    }

    public void setLaporanPerformaDriverList(List<LaporanPerformaDriver> performaDriverList) {
        this.performaDriverList = performaDriverList;
    }
}
