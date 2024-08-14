/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro2;

/**
 *
 * @author Aluno
 */
public class Cadastro2 {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Numa Pompiílio Bittencourt", "644", "Salvador");
        Cliente cliente1 = new Cliente("Rafael", 23, endereco1);
        
        
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + cliente1.getNome() );
        System.out.println("Idade: " + cliente1.getIdade());
        
        System.out.println("\nDados do Endereço: ");
        System.out.println("Endereço: " + cliente1.getEndereco().getLogradouro());
        System.out.println("Número: " + cliente1.getEndereco().getNumero());
        System.out.println("Cidade: " + cliente1.getEndereco().getCidade());
    }
}
