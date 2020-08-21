package br.com.paulo.ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import br.com.paulo.DAO.AlunoDAO;
import br.com.paulo.R;
import br.com.paulo.modelo.Aluno;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;


public class MainActivity extends AppCompatActivity {

    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Agenda");
        dao.salva(new Aluno("Alex", "1122223333", "alex@alura.com.br"));
        dao.salva(new Aluno("Fran", "1122223333", "fran@gmail.com"));



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


        ListView ListaDeAlunos = findViewById(R.id.listaDeAlunos);

        final List<Aluno> alunos = dao.todos();
        ListaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));

        ListaDeAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long l) {
                makeText(MainActivity.this, "" + posicao, LENGTH_SHORT).show();
                final Aluno alunoEscolhido = alunos.get(posicao);
                final Intent vaiParaCadastro = new Intent(MainActivity.this, CadastrodecontatoActivity.class);
                vaiParaCadastro.putExtra("Aluno", alunoEscolhido);
                startActivity(vaiParaCadastro);
            }
        });



    }}
