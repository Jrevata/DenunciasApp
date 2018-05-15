package com.jrevata.denunciasapp.denunciasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.jrevata.denunciasapp.denunciasapp.R;
import com.jrevata.denunciasapp.denunciasapp.adapters.DenunciaAdapter;
import com.jrevata.denunciasapp.denunciasapp.models.Ciudadano;
import com.jrevata.denunciasapp.denunciasapp.models.Denuncia;
import com.jrevata.denunciasapp.denunciasapp.services.ApiGeneratorService;
import com.jrevata.denunciasapp.denunciasapp.services.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        final DenunciaAdapter denunciaAdapter = new DenunciaAdapter();

        Integer ciudadano_id = getIntent().getExtras().getInt("ciudadano_id");

        Toast.makeText(this,ciudadano_id.toString(),Toast.LENGTH_LONG).show();

        ApiService service = ApiGeneratorService.createService(ApiService.class);

        Call<List<Denuncia>> call = service.listDenuncias(ciudadano_id);

        call.enqueue(new Callback<List<Denuncia>>() {
            @Override
            public void onResponse(Call<List<Denuncia>> call, Response<List<Denuncia>> response) {
                try {

                    int statusCode = response.code();
                    Log.d(TAG, "HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        List<Denuncia>  denuncias = response.body();
                        Log.d(TAG, "Denuncias: " + denuncias);

                        denunciaAdapter.setCompanies(denuncias);
                        recyclerView.setAdapter(denunciaAdapter);

                    } else {
                        Log.e(TAG, "onError: " + response.errorBody().string());
                        throw new Exception("Error en el servicio");
                    }

                } catch (Throwable t) {
                    try {
                        Log.e(TAG, "onThrowable: " + t.toString(), t);
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }catch (Throwable x){}
                }
            }

            @Override
            public void onFailure(Call<List<Denuncia>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.toString());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });



    }
}
