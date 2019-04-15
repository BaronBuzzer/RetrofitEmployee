package com.example.hpluv.employeemanager.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.hpluv.employeemanager.api.ApiClient;
import com.example.hpluv.employeemanager.api.ApiInterface;
import com.example.hpluv.employeemanager.model.Employee;
import com.example.hpluv.employeemanager.R;
import com.example.hpluv.employeemanager.RecyclerAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter adapter;
    private List<Employee> employees;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadJson();
    }

    public  void loadJson() {
        try {
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);

            apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);
            Toast.makeText(this, "Hereesadasde", Toast.LENGTH_LONG).show();
            Call<List<Employee>> call = apiInterface.getEmployee();

            call.enqueue(new Callback<List<Employee>>() {
                @Override
                public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                    employees = response.body();
                    adapter = new RecyclerAdapter(getApplicationContext(), employees);
                    recyclerView.setAdapter(adapter);
                }

                @Override
                public void onFailure(Call<List<Employee>> call, Throwable t) {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(MainActivity.this, "Error fetching data", Toast.LENGTH_SHORT).show();

                }
            });
        } catch (Exception e) {
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
