package br.edu.usj.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rafael on 16/08/17.
 */

public class HelloActivity extends Activity {

    private EditText texto;
    private TextView resultado;

    @Override
    protected void onCreate(
            @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hello);
        texto = (EditText) findViewById(R.id.nomeEditText);
        resultado = (TextView) findViewById(R.id.saudacaoTextView);
    }

    public void saudar(View view){
        String nome = texto.getText().toString();
        String mensagem = "Olá, "+ nome;
        resultado.setText(mensagem);
    }
}
