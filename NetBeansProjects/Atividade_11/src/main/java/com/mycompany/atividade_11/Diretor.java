/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_11;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    final double PREMIO = 0.5;
    final double valorBonificacao = (salario * bonificacao.getValor());
    final double valorPremio = (salario * PREMIO);

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }


    @Override
    public double SalarioFinal() {
        return (salario + valorBonificacao + valorPremio);
    }

    @Override
    public String toString() {
        return "\nDados do Diretor: " + 
                super.toString() +
                "\nValor da Bonificação: " + valorBonificacao +
                "\nValor do Premio: " + valorPremio +
                "\nSalario Final: " + SalarioFinal();
    }

    @Override
    public void admitir(Funcionario x) {
        System.out.println("\n=== Adimitindo Funcionario ===");
        System.out.println(x.toString());
    }

    @Override
    public void demitir(Funcionario x) {
        System.out.println("\n=== Demitindo Funcionario ===");
        System.out.println(x.toString());
    }
}
