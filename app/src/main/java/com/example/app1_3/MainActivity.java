package com.example.app1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.app1_3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    //Nécessite la modif du buil.gradle.kts(Module
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.InitHandlers();

    }

    private void InitHandlers(){
        binding.btnLogin.setOnClickListener(this::clickLogin);
        binding.btnReset.setOnClickListener(this::clickReset);
    }

    private void clickLogin(View view){
        String username  = binding.usernameField.getText().toString();
        String password = binding.passwordField.getText().toString();

        Log.d(TAG,String.format("usename='%s', Password='%s'",username,password));
    }

    private void clickReset(View view){
        binding.usernameField.setText("");
        binding.passwordField.setText("");

    }










}