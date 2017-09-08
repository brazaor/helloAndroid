package br.edu.usj.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by rafael on 06/09/17.
 */

public class SaudacaoImplicitaActivity extends Activity {
    private TextView saudacao;
    public static final String EXTRA_SAUDACAO_IMPLICITA =
            "br.edu.usj.helloandroid.msg_implicita";
    public static final String ACAO_SAUDACAO =
            "br.edu.usj.helloandroid.acao_saudacao";
    public static final String CATEGORIA_SAUDACAO =
            "br.edu.usj.helloandroid.categoria_saudacao";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_saudacao);
        saudacao = (TextView)findViewById(
                R.id.saudacaoTextView);

        Intent intent = getIntent(); // recuperando a Intent que chamou a execução desta activity
        String msg = intent.getStringExtra(EXTRA_SAUDACAO_IMPLICITA); //recuperando a informação extra vindo na Intent
        saudacao.setText(msg);
    }
}
