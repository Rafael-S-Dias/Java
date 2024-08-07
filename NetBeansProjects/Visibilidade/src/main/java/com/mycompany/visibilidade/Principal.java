/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.visibilidade;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        
        cliente.setNome("Rafael");
        cliente.setIdade(23);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
    }
}
