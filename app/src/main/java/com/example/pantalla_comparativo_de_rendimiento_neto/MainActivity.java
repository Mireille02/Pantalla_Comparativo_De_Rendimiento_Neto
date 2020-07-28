package com.example.pantalla_comparativo_de_rendimiento_neto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "Estado";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btm = findViewById(R.id.botom);
        btm.setOnClickListener(this);

        ImageButton imb = findViewById(R.id.imageButton);
        imb.setOnClickListener(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIService.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIService service = retrofit.create(APIService.class);
       // Call<Item> requesItem = service.listaItem();
    // Falta llamar al objeto y que este tenga 
    }

    @Override
    public void onClick(View v) {

    }
}