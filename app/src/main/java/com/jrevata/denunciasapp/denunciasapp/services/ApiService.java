package com.jrevata.denunciasapp.denunciasapp.services;

import com.jrevata.denunciasapp.denunciasapp.ResponseMessage;
import com.jrevata.denunciasapp.denunciasapp.models.Ciudadano;
import com.jrevata.denunciasapp.denunciasapp.models.Denuncia;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Alumno on 11/05/2018.
 */

public interface ApiService {

    String API_BASE_URL = "https://almacen-api-jrevata.c9users.io";

    @GET("api/v1/listDenuncia/{id}")
    Call<Denuncia> showProducto(@Path("id") Integer id);

    @FormUrlEncoded
    @POST("/api/v1/loginuser")
    Call<Ciudadano> Login(@Field("username") String username,
                          @Field("password") String password);


}
