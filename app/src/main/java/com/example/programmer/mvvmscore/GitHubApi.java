package com.example.programmer.mvvmscore;

import com.example.programmer.mvvmscore.model.Response;

import io.reactivex.Observable;
import retrofit2.http.GET;


/**
 * Created by Kamil on 2018-08-07.
 */
public interface GitHubApi {
    @GET("2.0/repositories?fields=values.name,values.owner,values.description")
    Observable<Response> listRepos();
}
