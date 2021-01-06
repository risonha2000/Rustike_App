package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CriarHamburguer_hamburguer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_hamburguer_hamburguer);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraTipoMolho(View view) {
        Intent paraTipoMolho = new Intent(this, CriarHamburguer_molho.class);
        startActivity(paraTipoMolho);
    }

    public void paraTipoIngredientes(View view) {
        Intent paraTipoIngredientes = new Intent(this, CriarHamburguer_ingredientes.class);
        startActivity(paraTipoIngredientes);
    }
}