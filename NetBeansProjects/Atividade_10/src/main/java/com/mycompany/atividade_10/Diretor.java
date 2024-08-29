/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_10;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    final double PREMIO = 0.2;
    final private double valorPremio = salarioBase * PREMIO;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }
    
    @Override
    public double getSalarioFinal() {
        return (salarioBase + valorPremio);
    }

    @Override
    public void admitir(Funcionario x) {
        System.out.println("=== Adimitindo Funcionario ===");
        System.out.println("Dados do Funcionario: ");
        System.out.println(x.toString());
    }

    @Override
    public void demitir(Funcionario x) {
        System.out.println("=== Demitindo Funcionario ===");
        System.out.println("Dados do Funcionario: ");
        System.out.println(x.toString());
    }

    @Override
    public String toString() {
        return "\nDados do Diretor: " + 
                super.toString() +
                "\nPorcentagem: 20%" + 
                "\nValor do Premio: " + valorPremio ;
    }
}
    

