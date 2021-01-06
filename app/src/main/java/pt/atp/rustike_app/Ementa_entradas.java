package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ementa_entradas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa_entrdas);
    }

    public void paraEmentaHamburguer(View view) {
        Intent paraEmentaHamburguer = new Intent(this, Ementa_hamburguer.class);
        startActivity(paraEmentaHamburguer);
    }

    public void paraEmentaSobremesas(View view) {
        Intent paraEmentaSobremesas = new Intent(this, Ementa_sobremesas.class);
        startActivity(paraEmentaSobremesas);
    }

    public void paraEmentaBebidas(View view) {
        Intent paraEmentaBebidas = new Intent(this, Ementa_bebidas.class);
        startActivity(paraEmentaBebidas);
    }

    public void paraMenuInicial(View view) {
        Intent paraMenuInicial = new Intent(this, Menu_Inicial.class);
        startActivity(paraMenuInicial);
    }
}