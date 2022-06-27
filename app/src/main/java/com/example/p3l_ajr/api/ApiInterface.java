package com.example.p3l_ajr.api;

import com.example.p3l_ajr.response.LaporanDetailPendapatanResponse;
import com.example.p3l_ajr.response.LaporanPenyewaanMobilResponse;
import com.example.p3l_ajr.response.LaporanPerformaDriverResponse;
import com.example.p3l_ajr.response.LaporanTopCustomerResponse;
import com.example.p3l_ajr.response.LaporanTopDriverResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiInterface {
    // UserExtra
    @Headers({"Accept: application/json"})
    @GET("penyewaan/laporan/penyewaanMobil/{bulan}/{tahun}")
    Call<LaporanPenyewaanMobilResponse> laporanPenyewaanMobil(@Path("bulan") int bulan, @Path("tahun") int tahun);

    @Headers({"Accept: application/json"})
    @GET("penyewaan/laporan/topCustomer/{bulan}/{tahun}")
    Call<LaporanTopCustomerResponse> laporanTopCustomer(@Path("bulan") int bulan, @Path("tahun") int tahun);

    @Headers({"Accept: application/json"})
    @GET("penyewaan/laporan/topDriver/{bulan}/{tahun}")
    Call<LaporanTopDriverResponse> laporanTopDriver(@Path("bulan") int bulan, @Path("tahun") int tahun);

    @Headers({"Accept: application/json"})
    @GET("penyewaan/laporan/detailPendapatan/{bulan}/{tahun}")
    Call<LaporanDetailPendapatanResponse> laporanDetailPendapatan(@Path("bulan") int bulan, @Path("tahun") int tahun);

    @Headers({"Accept: application/json"})
    @GET("penyewaan/laporan/performaDriver/{bulan}/{tahun}")
    Call<LaporanPerformaDriverResponse> laporanPerformaDriver(@Path("bulan") int bulan, @Path("tahun") int tahun);
}
