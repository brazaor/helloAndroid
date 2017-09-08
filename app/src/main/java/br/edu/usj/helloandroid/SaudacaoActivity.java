package br.edu.usj.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by rafael on 06/09/17.
 */

public class SaudacaoActivity extends Activity {

    private TextView saudacao;
    public static final String EXTRA_SAUDACAO = "br.edu.usj.helloandroid.msg";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_saudacao);
        saudacao = (TextView)findViewById(
                R.id.saudacaoTextView);

        Intent intent = getIntent(); // recuperando a Intent que chamou a execução desta activity
        String msg = intent.getStringExtra(EXTRA_SAUDACAO); //recuperando a informação extra vindo na Intent
        saudacao.setText(msg);
    }
}
