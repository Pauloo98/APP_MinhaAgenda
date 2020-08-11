package br.com.paulo.modelo;

public class Aluno {
    private final String nomeDoContato;
    private final String emailDoContato;
    private final String telefoneDoContato;

    public Aluno(String nomeDoContato, String emailDoContato, String telefoneDoContato) {
        this.nomeDoContato = nomeDoContato;
        this.emailDoContato = emailDoContato;
        this.telefoneDoContato = telefoneDoContato;
    }

    @Override
    public String toString() {
        return nomeDoContato;
    }

    //    public String getNomeDoContato() {
//        return nomeDoContato;
//    }
//
//    public String getEmailDoContato() {
//        return emailDoContato;
//    }
//
//    public String getTelefoneDoContato() {
//        return telefoneDoContato;
    }

