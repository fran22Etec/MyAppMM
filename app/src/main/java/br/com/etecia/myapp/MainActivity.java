package br.com.etecia.myapp;

import static br.com.etecia.myapp.R.id.idToolBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    //Declarando variavel global que irá representar o xml no java
    MaterialToolbar idToolBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Apresentando o xml para o java

        idToolBar = findViewById(R.id.idToolBar);


        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no hamburguer",
                        Toast.LENGTH_LONG).show();
            }
        });
        //Criando clique nos itens de menu
        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mFavorito:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Favorito",
                                Toast.LENGTH_LONG).show();
                        break;

                    case R.id.mBuscar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Buscar",
                                Toast.LENGTH_LONG).show();
                        break;

                    case R.id.mCompartilhar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Compartilhar",
                                Toast.LENGTH_LONG).show();
                        break;

                    case R.id.mSair:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Sair",
                                Toast.LENGTH_LONG).show();
                        break;


                    case R.id.mSalvar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Salvar",
                                Toast.LENGTH_LONG).show();
                        break;
                }

                return true;
            }
        });


    }

}