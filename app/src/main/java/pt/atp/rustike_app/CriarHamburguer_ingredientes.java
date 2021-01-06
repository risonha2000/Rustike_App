package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CriarHamburguer_ingredientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_hamburguer_ingredientes);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraBebidas(View view) {
        Intent paraBebidas = new Intent(this, CriarHamburguer_bebidas.class);
        startActivity(paraBebidas);
    }

    public void paraTipoCarne(View view) {
        Intent paraTipoCarne = new Intent(this, CriarHamburguer_hamburguer.class);
        startActivity(paraTipoCarne);
    }
}