/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prestacoes;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Prestacoes {

    static int parcelas = 10;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Digite o preço do produto desejado: ");
        double produto = scan.nextDouble();
        
        while (parcelas <0 || parcelas > 5) {
            System.out.println("Digite em quantas parcelas desejada pagar em até 05 vezes sem juros: ");
            parcelas = scan.nextInt();
        }
        double valor = produto / parcelas;
        
        System.out.println("Loja Mamão com Açucar");
        System.out.println("Seu pedido foi realizado com sucesso!");
        System.out.println("Valor total do produto: " + produto);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor das parcelas: " + valor);
        
        scan.close();
        
    }
}
