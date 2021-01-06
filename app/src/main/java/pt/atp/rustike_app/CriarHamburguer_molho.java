package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CriarHamburguer_molho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_hamburguer_molho);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraTipoPao(View view) {
        Intent paraTipoPao = new Intent(this, CriarHamburguer_pao.class);
        startActivity(paraTipoPao);
    }

    public void paraTipoCarne(View view) {
        Intent paraTipoCarne = new Intent(this, CriarHamburguer_hamburguer.class);
        startActivity(paraTipoCarne);
    }
}