package com.example.cesar.chords_cesar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private PessoaList psList = new PessoaList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSearch(View view){
        TextView txtLogin = findViewById(R.id.txtLogin);
        TextView txtSenha = findViewById(R.id.txtSenha);
        TextView lblResultado = findViewById(R.id.lblResultado);

        String login = String.valueOf(txtLogin.getText());
        String senha = String.valueOf(txtSenha.getText());

        Pessoa resultado = psList.searchLogin(login, senha);

        if(resultado!= null){
            lblResultado.setText("Bem vindo, " + resultado.getNome());
        }else{
            lblResultado.setText("Falha!\r\nVerifique a ortografia");
        }
    }

}
