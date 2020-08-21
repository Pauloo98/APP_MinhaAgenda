package br.com.paulo.modelo;

import java.io.Serializable;

public class Aluno implements Serializable {

    protected final String nomeDoContato;
    protected final String emailDoContato;
    protected final String telefoneDoContato;

    public Aluno(String nomeDoContato, String emailDoContato, String telefoneDoContato) {
        this.nomeDoContato = nomeDoContato;
        this.emailDoContato = emailDoContato;
        this.telefoneDoContato = telefoneDoContato;
    }

    @Override
    public String toString() {
        return nomeDoContato;
    }

    public String getNomeDoContato() {
        return nomeDoContato;
    }

    public String getEmailDoContato() {
        return emailDoContato;
    }

    public String getTelefoneDoContato() {
        return telefoneDoContato;
    }

}

