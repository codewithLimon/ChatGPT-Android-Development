package com.codewithlimon.chatgpt;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainApplication extends AppCompatActivity {
    private Button login_button;
    private Button signup_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing);

        login_button = findViewById(R.id.login_button);
        signup_button = findViewById(R.id.signup_button);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // handle login button click
                Toast.makeText(MainApplication.this, "Login clicked", Toast.LENGTH_SHORT).show();
            }
        });

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // handle signup button click
                Toast.makeText(MainApplication.this, "Signup clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
