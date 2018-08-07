package com.example.programmer.mvvmscore;

import com.example.programmer.mvvmscore.model.Response;
import com.example.programmer.mvvmscore.model.Value;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by Kamil on 2018-08-07.
 */
public class ApiManager {

    private static final String BASE_URL = "https://api.github.com/";

    private Retrofit buildRetrofit(){
        OkHttpClient okHttpClienBuilder = new OkHttpClient();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClienBuilder)
                .build();
    }

    public Observable<Response> getGitHubRepos(){
        return buildRetrofit().create(GitHubApi.class).listRepos();
    }

    public Observable<Value[]> sendRequest() {
        return getGitHubRepos()
                .subscribeOn(Schedulers.io())
                .map( r -> r.values);
    }
}
