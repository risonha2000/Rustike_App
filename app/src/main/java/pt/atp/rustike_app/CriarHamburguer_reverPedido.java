package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CriarHamburguer_reverPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_hamburguer_rever_pedido);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraEntradas(View view) {
        Intent paraEntradas = new Intent(this, CriarHamburguer_entradas.class);
        startActivity(paraEntradas);
    }

    public void paraEfetuarPagamento(View view) {
        Intent paraEfetuarPagamento = new Intent(this, EfetuarPagamento.class);
        startActivity(paraEfetuarPagamento);
    }
}