package com.application.isrosatellites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity{

    private RecyclerView satellitesMainAct;
    private ArrayList<Satellites> satelliteModels;
    private SatelliteAdapter satelliteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        satellitesMainAct = findViewById(R.id.satelliteRV);
        satelliteModels = new ArrayList<>();
        satelliteAdapter = new SatelliteAdapter(satelliteModels, this);

        //satellitesMainAct.setLayoutManager(new LinearLayoutManager(this));
        satellitesMainAct.setAdapter(satelliteAdapter);
        getSatellites();
        
    }
    private void getSatellites(){
        satelliteModels.clear();
        String url="https://isro.vercel.app/api/customer_satellites";
        String BASE_URL="https://isro.vercel.app/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SatelliteAPI retrofitAPI = retrofit.create(SatelliteAPI.class);
        Call<SatelliteModels> call;
        call=retrofitAPI.getAllNews(url);
        call.enqueue(new Callback<SatelliteModels>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<SatelliteModels> call, Response<SatelliteModels> response) {
                SatelliteModels newsModel=response.body();

                ArrayList<Satellites> satellites=newsModel.getSatellites();
                for(int i=0; i< satellites.size(); i++){
                    satelliteModels.add(new Satellites(satellites.get(i).getSatelliteId(), satellites.get(i).getSatelliteCountry(),satellites.get(i).getSatelliteLaunchDate(),
                            satellites.get(i).getSatelliteMass(),satellites.get(i).getSatelliteLauncher()));
                }
                satelliteAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<SatelliteModels> call, Throwable t) {

            }
        });

    }

}