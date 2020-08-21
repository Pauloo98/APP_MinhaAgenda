package br.com.paulo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.com.paulo.DAO.AlunoDAO;
import br.com.paulo.R;
import br.com.paulo.modelo.Aluno;

public class CadastrodecontatoActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_de_contato);
        setTitle("Cadastro de Contato");



        final AlunoDAO dao = new AlunoDAO();
        final EditText nome = findViewById(R.id.nome);
        final EditText email = findViewById(R.id.email);
        final EditText telefone = findViewById(R.id.telefone);
        Button botaoSalvar = findViewById(R.id.botao_de_cadastro);

        Intent dados = getIntent();
        Aluno aluno = (Aluno) dados.getSerializableExtra("aluno");
        nome.setText(aluno.getNomeDoContato());
        email.setText(aluno.getEmailDoContato());
        telefone.setText(aluno.getTelefoneDoContato());


        // COLOCAR O LISTENER PARA CAPTURAR AS AÇÕES DO BOTAO
        botaoSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                String nomeDoContato = nome.getText().toString();
                String emailDoContato = email.getText().toString();
                String telefoneDoContato = telefone.getText().toString();

                Aluno alunoCriado = new Aluno(nomeDoContato, emailDoContato, telefoneDoContato);
                dao.salva(alunoCriado);

                finish();


            }

        });
    }
}