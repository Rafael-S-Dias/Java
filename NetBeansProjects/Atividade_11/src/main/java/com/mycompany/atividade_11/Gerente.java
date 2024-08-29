/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_11;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{
    final double valorBonificacao = (salario * bonificacao.getValor());
  

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }
    public double SalarioFinal() {
       return (salario + valorBonificacao);
    }

    @Override
    public String toString() {
        return "\nDados do Gerente: " + 
                super.toString() +
                "\nValor Bonificação: " + valorBonificacao +
                "\nSalario Final: " + SalarioFinal();
    }
    
}
