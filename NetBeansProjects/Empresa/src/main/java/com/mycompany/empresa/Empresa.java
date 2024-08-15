/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

/**
 *
 * @author Aluno
 */
public class Empresa {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("246835791", "Rafael", 23, 5000, Setor.FINANCEIRO, Sexo.MASCULINO);
        
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("ID: " + funcionario1.getId());
        System.out.println("Idade: " + funcionario1.getIdade() + " anos");
        System.out.println("Sexo: " + funcionario1.getSexo().getTexto());
        System.out.println("Setor: " + funcionario1.getSetor().getTexto());
        System.out.println("Salario: R$" + funcionario1.getSalario());
        
    }
}
