package br.edu.usj.helloandroid;

import android.app.Activity;
import android.content.Intent;
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
    //private TextView resultado; //esse atributo será comentado quando deixarmos de exibir a informação na mesma activity e criarmos uma intent

    @Override
    protected void onCreate(
            @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hello);
        texto = (EditText) findViewById(R.id.nomeEditText);
        //resultado = (TextView) findViewById(R.id.saudacaoTextView);
    }

    public void saudar(View view){
        String nome = texto.getText().toString();
        String mensagem = "Olá, "+ nome;
        //resultado.setText(mensagem);
        //A seguir a criação de uma intent do modo explicito
        //Intent intent = new Intent(this, SaudacaoActivity.class);
        //intent.putExtra(SaudacaoActivity.EXTRA_SAUDACAO, mensagem);
        //A seguir a criação de uma intent do modo implicito
        Intent intent = new Intent(
                SaudacaoImplicitaActivity.ACAO_SAUDACAO);
        intent.addCategory(
                SaudacaoImplicitaActivity.CATEGORIA_SAUDACAO);
        intent.putExtra(
                SaudacaoImplicitaActivity.EXTRA_SAUDACAO_IMPLICITA,
                mensagem);
        startActivity(intent); // chamando a inicialização da activity, passando a intent criada como parâmetro
    }
}
