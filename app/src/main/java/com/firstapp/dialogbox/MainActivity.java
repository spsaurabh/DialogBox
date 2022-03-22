package com.firstapp.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnwin,btnloose;

        btnwin = findViewById(R.id.buttonwin);
        btnloose = findViewById(R.id.buttonloose);

        btnwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWinDialog();
            }
        });
        btnloose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLooseDialog();
            }
        });

    }
    private void openWinDialog() {
    }

    private void openLooseDialog() {
    }
}