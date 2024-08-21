/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;
    private Setor setor;
    private double salario;
    private String telefone;
    private String email;
    private Sexo sexo;
    private Endereco endereco;

    public Funcionario(int id, String nome, int idade, String cpf, String rg, String matricula, String dataNascimento, Setor setor, double salario, String telefone, String email, Sexo sexo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Dados do funcionário: " + 
                "\nId: " + id +
                "\nNome: " + nome + 
                "\nIdade: " + idade + " anos" +
                "\nCPF: " + cpf + 
                "\nRG: " + rg +
                "\nMatrícula: " + matricula + 
                "\nData de Nascimento: " + dataNascimento + 
                "\nSetor: " + setor.getNome() + 
                "\nSalário: " + salario + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\nSexo: " + sexo.getTexto() + 
                "\nEndereço: " + endereco;
    }
    
}
