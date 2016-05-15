package com.salesianostriana.dam.educatia_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText user, pass;
    Button register;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.editText_email);
        pass = (EditText) findViewById(R.id.editText_contrasena);
        register = (Button) findViewById(R.id.btn_entrar);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = user.getText().toString();
                String passw = pass.getText().toString();

                i = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
                LoginActivity.this.finish();
            }
        });
    }
}
