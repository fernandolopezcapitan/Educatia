package com.salesianostriana.dam.educatia_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        getSupportActionBar().setTitle("Calendario");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calendario, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        String mensaje = "";
        Intent i;
        switch(id) {
            case R.id.mi_perfil_inicio: mensaje = "Inicio";

                onBackPressed();
                //MainActivity.this.finish();
                break;
         }

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
