package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
    }

    public void paraMenuInicial(View view) {
        Intent paraMenuInicial = new Intent(this, Menu_Inicial.class);
        startActivity(paraMenuInicial);
    }
}