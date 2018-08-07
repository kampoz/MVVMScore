package com.example.programmer.mvvmscore;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by Kamil on 2018-08-07.
 */
public class ScoreViewModel extends ViewModel {

//    public String counter = String.valueOf(0);

    public MutableLiveData<String> counter = new MutableLiveData<>();

    public MutableLiveData<String> getScore(){
        if (counter == null) {
            counter = new MutableLiveData<String>();
        }
        return counter;
    }

}