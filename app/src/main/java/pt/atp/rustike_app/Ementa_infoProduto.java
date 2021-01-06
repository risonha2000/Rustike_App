package pt.atp.rustike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ementa_infoProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa_info_produto);
    }

    public void paraEmentaHamburguer(View view) {
        Intent paraEmentaHamburguer = new Intent(this, Ementa_hamburguer.class);
        startActivity(paraEmentaHamburguer);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}