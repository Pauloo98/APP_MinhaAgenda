package br.com.paulo.ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.text.NoCopySpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.paulo.DAO.AlunoDAO;
import br.com.paulo.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Agenda");



        FloatingActionButton botaoAdicionar = findViewById(R.id.adicionarAluno);
        botaoAdicionar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

               startActivity(new Intent(MainActivity.this, CadastrodecontatoActivity.class));

            }

        });




    }

    @Override
    protected void onResume() {
        super.onResume();

        AlunoDAO dao = new AlunoDAO();
        ListView ListaDeAlunos = findViewById(R.id.listaDeAlunos);

        ListaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));

    }
}
