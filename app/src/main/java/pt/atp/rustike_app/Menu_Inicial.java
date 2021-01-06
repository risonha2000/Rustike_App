package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__inicial);
    }

    public void paraEmentaInicial(View view) {
        Intent paraEmentaInicial = new Intent(this, Ementa_inicio.class);
        startActivity(paraEmentaInicial);
    }


    public void paraEntrar(View view) {
        Intent paraEntrar = new Intent(this, Entrar.class);
        startActivity(paraEntrar);
    }


    public void paraPedidoDecorrer(View view) {
        Intent paraPedidoDecorrer = new Intent(this, Pedidos_aDecorer.class);
        startActivity(paraPedidoDecorrer);
    }
}