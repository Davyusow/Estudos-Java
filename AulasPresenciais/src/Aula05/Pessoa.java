package Aula05;

import java.time.LocalDate;

public class Pessoa {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String cpf, String nome, int dia, int mes, int ano) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = LocalDate.of(dia,mes,ano);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
