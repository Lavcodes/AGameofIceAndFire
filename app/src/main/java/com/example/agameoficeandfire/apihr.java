package com.example.agameoficeandfire;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apihr {
    String BASE_URL=" https://api.myjson.com/bins/";
    @GET("qbn5y")
    Call<List<howrelatedquestions>> getquestions();
}
