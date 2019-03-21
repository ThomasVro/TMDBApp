package com.example.thomas.movies;

import java.util.List;

public interface OnGetGenresCallback {

    void onSuccess(List<Genres> genres);

    void onError();
}
