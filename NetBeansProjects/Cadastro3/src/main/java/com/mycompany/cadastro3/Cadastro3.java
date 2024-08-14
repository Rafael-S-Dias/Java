/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro3;

/**
 *
 * @author Aluno
 */
public class Cadastro3 {

    public static void main(String[] args) {
        Pet cachorro1 = new Pet("Thor", 12, "Cockspaniel");
        Cliente cliente1 = new Cliente("Rafael", 23, cachorro1);
        
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        
        System.out.println("\nDados do Pet: ");
        System.out.println("Nome: " + cliente1.getPet().getNome());
        System.out.println("Idade: " + cliente1.getPet().getIdade());
        System.out.println("Raça: " + cliente1.getPet().getRaca());
    }
}
