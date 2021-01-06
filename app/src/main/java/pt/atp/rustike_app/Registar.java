package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);
    }


    public void paraEntrar(View view) {
        Intent paraEntrar = new Intent(this, Entrar.class);
        startActivity(paraEntrar);
    }



    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }
}