package com.example.dsi32.professionel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dsi32.professionel.ui.gallery.GalleryViewModel;
import com.example.dsi32.professionel.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton = findViewById(R.id.login);
        final EditText email = (EditText) findViewById(R.id.username);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(MainActivity.this, com.example.dsi32.professionel.interface2.class);

                intent.putExtra("email", email.getText().toString());

                //intent.putExtra("data", bundle);

                MainActivity.this.startActivity(intent);
            }
        });
    }
}
