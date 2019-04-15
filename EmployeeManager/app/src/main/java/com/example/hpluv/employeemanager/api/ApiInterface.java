package com.example.hpluv.employeemanager.api;

import com.example.hpluv.employeemanager.model.Employee;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;
/**
 * Created by HpLuv on 4/14/2019.
 */

public interface ApiInterface {

    @GET("/bins/ubrj0")
    Call<List<Employee>> getEmployee();
}
