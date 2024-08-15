/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Cadastro6 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("02/08/2024", "Débito", "Fuboca", 23, "Rua A", "(71)98426-8186");
        Funcionario funcionario1 = new Funcionario("24683288", "Programador Junior", 2000, "Rafael", 23, "Avenida C", "(71)98825-3324");
        
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Data da Última Compra: " + cliente1.getDataDeCompra());
        System.out.println("Forma de Pagamento: " + cliente1.getFormaDePagamento());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        
        System.out.println("\nDados do Funcionario: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Número de Matricula: " + funcionario1.getMatricula());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Endereço: " + funcionario1.getEndereco());
        System.out.println("Telefone: " + funcionario1.getTelefone());
    }
    
}
