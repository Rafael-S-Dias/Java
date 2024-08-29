/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_10;

/**
 *
 * @author Aluno
 */
public class Mototboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Mototboy(String carteiraDeHabilitacao, String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Dados do Mototboy: " + 
                super.toString() +
                "\nCarteira de Habilitacao: " + carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
    
}
