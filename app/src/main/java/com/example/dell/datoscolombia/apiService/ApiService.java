package com.example.dell.datoscolombia.apiService;

import com.example.dell.datoscolombia.models.Dato;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Gallo on 1/06/2017.
 */

public interface ApiService {
    @GET("g5ni-ey3e.json")
    Call<ArrayList<Dato>> obtenerDato();

}
