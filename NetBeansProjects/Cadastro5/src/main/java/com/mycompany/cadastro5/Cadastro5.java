/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro5;

/**
 *
 * @author Aluno
 */
public class Cadastro5 {

    public static void main(String[] args) {
        Processador processador1 = new Processador("2.5GHz", "Intel", "I9 - 14900K");
        Memoria memoria1 = new Memoria("16 Gb", "HyperX", "Fury RGB");
        
        System.out.println("Especificações do Processador: ");
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
        System.out.println("Frequencia: " + processador1.getFrequencia());
        
        System.out.println("\nEspecificações da Memoria: ");
        System.out.println("Marca: " + memoria1.getMarca());
        System.out.println("Modelo: " + memoria1.getModelo());
        System.out.println("Capacidade de Armazenamento: " + memoria1.getCapacidadeArmazenamento());
    }
}
