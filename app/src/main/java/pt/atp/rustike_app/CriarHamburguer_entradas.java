package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CriarHamburguer_entradas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_hamburguer_entradas);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraBebidas(View view) {
        Intent paraBebidas = new Intent(this, CriarHamburguer_bebidas.class);
        startActivity(paraBebidas);
    }

    public void paraReverPedido(View view) {
        Intent paraReverPedido = new Intent(this, CriarHamburguer_reverPedido.class);
        startActivity(paraReverPedido);
    }
}