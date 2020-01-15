package com.example.agameoficeandfire;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apinerd2 {
    String BASE_URL="https://api.myjson.com/bins/";
    @GET("bk3d2")
    Call<List<Onlynerdstype2ques>> getquestions();
}
