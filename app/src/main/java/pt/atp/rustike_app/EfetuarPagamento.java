package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EfetuarPagamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efetuar_pagamento);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraLevantarPedido(View view) {
        Intent paraLevantarPedido = new Intent(this, LevantarNaLoja.class);
        startActivity(paraLevantarPedido);
    }

    public void paraPedidoDecorrer(View view) {
        Intent paraPedidoDecorrer = new Intent(this, Pedidos_aDecorer.class);
        startActivity(paraPedidoDecorrer);
    }
}
