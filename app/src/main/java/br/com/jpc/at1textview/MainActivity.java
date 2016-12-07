package br.com.jpc.at1textview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView tv_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        //
        tv_nome = (TextView) findViewById(R.id.tv_texto);
        tv_nome.setText("Issao");
    }

}
