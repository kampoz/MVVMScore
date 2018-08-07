package com.example.programmer.mvvmscore;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.programmer.mvvmscore.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ScoreViewModel scoreViewModel;
    Button btnAddOne;
    TextView tvCounter;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        activityMainBinding.setViewmodel(scoreViewModel);
        activityMainBinding.setLifecycleOwner(this);

        btnAddOne = findViewById(R.id.btn_PLusOne);
        tvCounter = findViewById(R.id.tvCounter);
        et = findViewById(R.id.et);


        btnAddOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("LiveData", scoreViewModel.getScore().getValue());
            }
        });

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                scoreViewModel.counter.setValue(s.toString());
            }
        });

    }
}

