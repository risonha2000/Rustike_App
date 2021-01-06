package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pedidos_Historico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos__historico);
    }

    public void paraMenuInicial(View view) {
        Intent paraMenuInicial = new Intent(this, Menu_Inicial.class);
        startActivity(paraMenuInicial);
    }

    public void paraPedidoDecorrer(View view) {
        Intent paraPedidoDecorrer = new Intent(this, Pedidos_aDecorer.class);
        startActivity(paraPedidoDecorrer);
    }

    public void paraHistoricoPedido(View view) {
        Intent paraHistoricoPedido = new Intent(this, Pedidos_historico_pedido.class);
        startActivity(paraHistoricoPedido);
    }
}