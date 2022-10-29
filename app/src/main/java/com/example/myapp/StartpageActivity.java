package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONException;
import org.json.JSONObject;
import com.example.myapp.helper.DatabaseHandler;
import com.example.myapp.helper.Functions;
import com.example.myapp.helper.SessionManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class StartpageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);

        Button button_deaf = findViewById(R.id.deaf_register);
        button_deaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartpageActivity.this, LoginActivity.class));
            }
        });

        Button button_blind = findViewById(R.id.blind_register);
        button_blind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartpageActivity.this, LoginActivity_b.class));
            }
        });
    }
}
