package br.com.local.listapersonagensnaruto_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonagensKonoha extends AppCompatActivity {

    TextView ninjaskonoha;
    ImageView imgkonoha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personagens_konoha);

        ninjaskonoha = findViewById(R.id.ninjaskonoha);
        imgkonoha = findViewById(R.id.imgkonoha);

        Intent konoha = getIntent();

        String ninjas_konoha = konoha.getStringExtra("konoha");
        int img_konoha = konoha.getIntExtra("imgkonoha", 0);

        ninjaskonoha.setText(ninjas_konoha);
        imgkonoha.setImageResource(img_konoha);
    }
}