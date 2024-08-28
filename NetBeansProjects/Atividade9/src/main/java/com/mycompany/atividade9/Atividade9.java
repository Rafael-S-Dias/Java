/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade9;

/**
 *
 * @author Aluno
 */
public class Atividade9 {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();
        
        System.out.println("Soma: " + soma.calcular(4, 2));
        System.out.println("Subtração: " + sub.calcular(4, 2));
        System.out.println("Multiplicação: " + mult.calcular(4, 2));
        System.out.println("Divizão: " + div.calcular(4, 2));
        
        
        
    }
}
