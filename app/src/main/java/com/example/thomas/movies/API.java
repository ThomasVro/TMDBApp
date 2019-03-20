package com.example.thomas.movies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );
}