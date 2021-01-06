package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevantarNaLoja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levantar_na_loja);
    }

    public void paraNovidades(View view) {
        Intent paraNovidades = new Intent(this, Novidades.class);
        startActivity(paraNovidades);
    }

    public void paraPedidoDecorrer(View view) {
        Intent paraPedidoDecorrer = new Intent(this, Pedidos_aDecorer.class);
        startActivity(paraPedidoDecorrer);
    }


    public void paraEfetuarPagamento(View view) {
        Intent paraEfetuarPagamento = new Intent(this, EfetuarPagamento.class);
        startActivity(paraEfetuarPagamento);
    }


}