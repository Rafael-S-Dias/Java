/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_11;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario{

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.bonificacao = bonificacao;
    }
    
   protected Bonificacao bonificacao; 
}
