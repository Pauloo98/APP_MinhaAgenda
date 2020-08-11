package br.com.paulo.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.paulo.modelo.Aluno;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
