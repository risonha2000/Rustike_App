package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void paraMenuInicial(View view) {
        Intent paraMenuInicial = new Intent(this, Menu_Inicial.class);
        startActivity(paraMenuInicial);
    }

    /*
    public void paraEntrar(View view) {
        Intent paraEntrar = new Intent(this, Entrar.class);
        startActivity(paraEntrar);
    }
    MAIS UM!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */
}