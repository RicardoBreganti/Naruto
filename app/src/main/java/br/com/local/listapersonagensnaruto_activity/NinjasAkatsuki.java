package br.com.local.listapersonagensnaruto_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NinjasAkatsuki extends AppCompatActivity {

    ListView lista_akatsuki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ninjas_akatsuki);

        lista_akatsuki = findViewById(R.id.akatsuki);

        Adaptador adaptador = new Adaptador();

        lista_akatsuki.setAdapter(adaptador);

        lista_akatsuki.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent akatsuki = new Intent(getApplicationContext(), PersonagensAkatsuki.class);
                akatsuki.putExtra("akatsuki", StringNome.Akatsuki.akatsuki[position]);
                akatsuki.putExtra("imgakatsuki", ImagemPersonagens.PersonagensAkatsuki.imgakatsuki[position]);
                Toast.makeText(getApplicationContext(),
                        "Clicou em um item da lista de personagens: " + StringNome.Akatsuki.akatsuki[position],
                        Toast.LENGTH_SHORT).show();

                startActivity(akatsuki);
            }
        });
    }

    public class Adaptador extends BaseAdapter {
        @Override
        public int getCount() {
            return ImagemPersonagens.PersonagensAkatsuki.imgakatsuki.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView ninjasakatsuki;
            ImageView imgakatsuki;

            View mostrar = getLayoutInflater().inflate(R.layout.akatsuki, null);

            ninjasakatsuki = mostrar.findViewById(R.id.ninjasakatsuki);
            imgakatsuki = mostrar.findViewById(R.id.imgakatsuki);

            ninjasakatsuki.setText(StringNome.Akatsuki.akatsuki[position]);
            imgakatsuki.setImageResource(ImagemPersonagens.PersonagensAkatsuki.imgakatsuki[position]);
            return mostrar;
        }
    }
}