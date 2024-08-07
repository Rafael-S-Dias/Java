/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concatenar;

/**
 *
 * @author Aluno
 */
public class Concatenar {

    public static void main(String[] args) {
        String nome = "Gabriel";
        String sobrenome = "Fuboca";
        
        //Quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        //Concatenando nome e sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        //Maiscula
        System.out.println("Escrito em maisculo: " + nomeCompleto.toUpperCase());
        
        //Minuscula
        System.out.println("Escrito em minusculo: " + nomeCompleto.toLowerCase());;
    }
}
