package tech.ada.banco.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, String telefone) {
            setCpf(cpf);
            setDataNascimento(dataNascimento);
            this.nome = nome;
            this.telefone = telefone;
        }

    public Pessoa(String nome, String dataNascimento, String cpf, String telefone) {

        this(nome,LocalDate.parse(dataNascimento), cpf, telefone);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if(dataNascimento.plusYears(18).isAfter(LocalDate.now())) {
            throw new RuntimeException("Data Inválida!");
        } else {
            this.dataNascimento = dataNascimento;
        }
    }

    public void setCpf(String cpf) {
        if (this.cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("Tamanho do CPF Inválido!");
            throw new RuntimeException();
        }
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome " + nome + " Data de Nascimento " + dataNascimento + " CPF " + cpf + " Telefone " + telefone;
    }

}