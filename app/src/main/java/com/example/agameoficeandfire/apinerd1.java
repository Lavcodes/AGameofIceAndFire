package com.example.agameoficeandfire;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apinerd1 {
    String BASE_URL="https://api.myjson.com/bins/";
    @GET("1a38g6")
    Call<List<Onlynerdstype1ques>> getquestions();
}
