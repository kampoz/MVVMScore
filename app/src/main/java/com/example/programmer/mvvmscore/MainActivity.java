package com.example.programmer.mvvmscore;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
//        activityMainBinding.setViewmodel(new ScoreViewModel());

        btnAddOne = findViewById(R.id.btn_PLusOne);
        tvCounter = findViewById(R.id.tvCounter);
                et = findViewById(R.id.et);
                btnAddOne.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                addOneForTeamA(v);
//                scoreViewModel.counter = String.valueOf(Integer.parseInt(scoreViewModel.counter + 1));
                        scoreViewModel.counter = et.getText().toString();
                Log.d("ViewModel", scoreViewModel.counter);
//                tvCounter.setText(scoreViewModel.counter);
            }
        });

    }

    public void addOneForTeamA(View v) {
        scoreViewModel.counter = String.valueOf(Integer.parseInt(scoreViewModel.counter + 1));
//        displayForTeamA(scoreViewModel.counter);
    }
}
