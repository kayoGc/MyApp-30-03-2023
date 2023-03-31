package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    MaterialToolbar idToolBar;

    //Declarando variável global que irá o xml no java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idToolBar = findViewById(R.id.idToolBar);

        // Criando clique no menu de navagação;
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no menu hamburguer", Toast.LENGTH_SHORT).show();
            }
        });

        // criando clique nos itens do menu;

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu favorito", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBuscar:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu buscar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mCompartilhar:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu compartilhar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSair:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu Sair", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSave:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu Salvar", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;


            }
        });
    }
}