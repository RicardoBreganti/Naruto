package br.com.local.listapersonagensnaruto_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_inicial);
    }

    public void konoha(View view)
    {
        Intent konoha = new Intent(getApplicationContext(), NinjasKonoha.class);
        Toast.makeText(getApplicationContext(),
                "Clicou em : Ninjas de Konoha",
                Toast.LENGTH_SHORT).show();
        startActivity(konoha);
    }

    public void akatsuki(View view)
    {
        Intent akatsuki = new Intent(getApplicationContext(), NinjasAkatsuki.class);
        Toast.makeText(getApplicationContext(),
                "Clicou em : Akatsuki",
                Toast.LENGTH_SHORT).show();
        startActivity(akatsuki);
    }
}