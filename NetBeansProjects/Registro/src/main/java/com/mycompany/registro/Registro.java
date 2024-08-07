/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registro;

/**
 *
 * @author Aluno
 */
public class Registro {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Fuboca", 23, "123456", 2000);
        
        /*
        funcionario.setNome("Fuboca");
        funcionario.setIdade(23);
        funcionario.setNumeroRegistro("123456");
        funcionario.setSalario(2000); */
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Número de registro: " + funcionario.getNumeroRegistro());
        System.out.println("Sálario: " + funcionario.getSalario());
    }
}
