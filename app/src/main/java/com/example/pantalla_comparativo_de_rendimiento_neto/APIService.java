package com.example.pantalla_comparativo_de_rendimiento_neto;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    public static final String URL = "";
    @GET("item")
    Call<Item> listaItem();
}
