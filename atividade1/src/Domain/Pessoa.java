package Domain;

import java.util.Date;

public class Pessoa {
    private String nome;
    private int idade;
    private String dataNascimento;

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String dataNascimento) {
        this(nome, idade);
        this.dataNascimento = dataNascimento;
    }
}
