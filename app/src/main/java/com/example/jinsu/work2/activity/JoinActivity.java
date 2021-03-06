package com.example.jinsu.work2.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jinsu.work2.util.CallonClick;
import com.example.jinsu.work2.R;
import com.example.jinsu.work2.databinding.ActivityJoinBinding;
import com.example.jinsu.work2.viewmodel.MainViewModel;
import com.example.jinsu.work2.viewmodel.VIewModelFactory;

//회원가입 액티비티
public class JoinActivity extends AppCompatActivity implements CallonClick{

//    private ActivityJoinBinding binding;
    private ActivityJoinBinding binding;
    private MainViewModel mainViewModel;
    private VIewModelFactory vIewModelFactory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivity();
    }

    private void initActivity()
    {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_join);
        vIewModelFactory = new VIewModelFactory(this);
        mainViewModel = ViewModelProviders.of(this,vIewModelFactory).get(MainViewModel.class);
        binding.setJoin(mainViewModel);

    }

    //이메일 인증하기 버튼 누를시
    @Override
    public void onBtnClick(View vIew) {
        mainViewModel.onJoinUser(this);
    }

    @Override
    public void textChanged(int index) {
    }
}
