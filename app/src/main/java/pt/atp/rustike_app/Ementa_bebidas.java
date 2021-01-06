package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ementa_bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa_bebidas);
    }

    public void paraEmentaHamburguer(View view) {
        Intent paraEmentaHamburguer = new Intent(this, Ementa_hamburguer.class);
        startActivity(paraEmentaHamburguer);
    }

    public void paraEmentaSobremesas(View view) {
        Intent paraEmentaSobremesas = new Intent(this, Ementa_sobremesas.class);
        startActivity(paraEmentaSobremesas);
    }

    public void paraEmentaEntradas(View view) {
        Intent paraEmentaEntradas = new Intent(this, Ementa_entradas.class);
        startActivity(paraEmentaEntradas);
    }

    public void paraMenuInicial(View view) {
        Intent paraMenuInicial = new Intent(this, Menu_Inicial.class);
        startActivity(paraMenuInicial);
    }
}