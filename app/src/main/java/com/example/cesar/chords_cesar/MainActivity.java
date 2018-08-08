package com.example.cesar.chords_cesar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MusicList store = new MusicList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSearch(View view){
        Spinner spnBanda = findViewById(R.id.spnBanda);
        Spinner spnMusica = findViewById(R.id.spnMusica);
        TextView lblResultado = findViewById(R.id.lblResultado);

        String banda = String.valueOf(spnBanda.getSelectedItem());
        String musica = String.valueOf(spnMusica.getSelectedItem());

        Music resultado = store.searchMusic(new Specification(banda, musica));

        StringBuilder resultadoFinal = new StringBuilder();

        if(resultado != null){
            resultadoFinal.append(resultado.getChords());
            lblResultado.setText(resultadoFinal);
        }else{
            lblResultado.setText("Dados não encontrados");
        }
    }

}
