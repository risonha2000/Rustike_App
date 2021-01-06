package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CriarHamburguer_bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_hamburguer_bebidas);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraIngredientes(View view) {
        Intent paraIngredientes = new Intent(this, CriarHamburguer_ingredientes.class);
        startActivity(paraIngredientes);
    }

    public void paraEntradas(View view) {
        Intent paraEntradas = new Intent(this, CriarHamburguer_entradas.class);
        startActivity(paraEntradas);
    }
}