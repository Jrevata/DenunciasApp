package com.jrevata.denunciasapp.denunciasapp.services;

import com.jrevata.denunciasapp.denunciasapp.models.Ciudadano;
import com.jrevata.denunciasapp.denunciasapp.models.Denuncia;
import com.jrevata.denunciasapp.denunciasapp.models.ResponseMessage;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
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

    @GET("api/v1/listDenuncia/{id}")
    Call<List<Denuncia>> listDenuncias(@Path("id") Integer ciudadano_id);



    @FormUrlEncoded
    @POST("/api/v1/createDenuncia")
    Call<ResponseMessage> createDenuncia(@Field("ciudadanos_id") Integer ciudadanos_id,
                                         @Field("titulo") String titulo,
                                         @Field("descripcion") String descripcion,
                                         @Field("coordenadas") String coordenadas
    );

    @Multipart
    @POST("/api/v1/createDenuncia")
    Call<ResponseMessage> createDenunciaWithImage(
            @Part("ciudadanos_id") RequestBody ciudadanos_id,
            @Part("titulo") RequestBody titulo,
            @Part("descripcion") RequestBody descripcion,
            @Part("coordenadas") RequestBody coordenadas,
            @Part MultipartBody.Part imagen
    );




}
