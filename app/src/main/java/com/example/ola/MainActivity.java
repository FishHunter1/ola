package com.example.ola;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvPrincipal;
    private EditText etPrincipal;
    private Button btnPrincipal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPrincipal = findViewById(R.id.tv_Principal);
        etPrincipal = findViewById(R.id.et_Principal);
        btnPrincipal = findViewById(R.id.btn_Principal);

        btnPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = etPrincipal.getText().toString();
            }
        });
    }
}