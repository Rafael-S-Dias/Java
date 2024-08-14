/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro4;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{
    private String matricula;
    private String cargo;
    private double salario;

    public Funcionario(String matricula, String cargo, double salario, String nome, int idade) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
