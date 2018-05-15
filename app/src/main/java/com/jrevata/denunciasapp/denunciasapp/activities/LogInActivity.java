package com.jrevata.denunciasapp.denunciasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jrevata.denunciasapp.denunciasapp.R;
import com.jrevata.denunciasapp.denunciasapp.models.Ciudadano;
import com.jrevata.denunciasapp.denunciasapp.services.ApiGeneratorService;
import com.jrevata.denunciasapp.denunciasapp.services.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogInActivity extends AppCompatActivity {
    private static final String TAG = LogInActivity.class.getSimpleName();
    private TextView username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        username = findViewById(R.id.usuario);
        password = findViewById(R.id.password);
    }

    public void logIn(View view){

        String username = this.username.getText().toString();
        String password = this.password.getText().toString();
        ApiService service = ApiGeneratorService.createService(ApiService.class);

        Call<Ciudadano> call = service.Login(username,password);

        call.enqueue(new Callback<Ciudadano>() {
            @Override
            public void onResponse(Call<Ciudadano> call, Response<Ciudadano> response) {
                try {

                    int statusCode = response.code();
                    Log.d(TAG, "HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                       Ciudadano ciudadano = response.body();

                        Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                        intent.putExtra("ciudadano_id", ciudadano.getId());
                        startActivity(intent);
                    } else {
                        Log.e(TAG, "onError: " + response.errorBody().string());
                        throw new Exception("Error en el servicio");
                    }

                } catch (Throwable t) {
                    try {
                        Log.e(TAG, "onThrowable: " + t.toString(), t);
                        Toast.makeText(LogInActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }catch (Throwable x){}
                }



            }

            @Override
            public void onFailure(Call<Ciudadano> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.toString());
                Toast.makeText(LogInActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });

    }
}
