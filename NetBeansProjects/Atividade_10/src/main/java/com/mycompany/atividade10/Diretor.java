/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade10;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    final double PREMIO = 0.2;
    double valorPremio;
    
    public double getvalorPremio() {
        return (super.salarioBase * PREMIO);
    }
    
    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        return (super.salarioBase + valorPremio);
    }

    @Override
    public void admitir(Funcionario x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void demitir(Funcionario x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Daddos do Diretor: " + 
                super.toString() +
                "\nPorcentagem: 20%" + 
                "\nValor do Premio: " + valorPremio;
    }
    
}
