package br.com.local.listapersonagensnaruto_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonagensAkatsuki extends AppCompatActivity {

    TextView ninjasakatsuki;
    ImageView imgakatsuki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personagens_akatsuki);

        ninjasakatsuki = findViewById(R.id.ninjasakatsuki);
        imgakatsuki = findViewById(R.id.imgakatsuki);

        Intent akatsuki = getIntent();

        String ninjas_akatsuki = akatsuki.getStringExtra("akatsuki");
        int img_akatsuki = akatsuki.getIntExtra("imgakatsuki", 0);

        ninjasakatsuki.setText(ninjas_akatsuki);
        imgakatsuki.setImageResource(img_akatsuki);
    }
}