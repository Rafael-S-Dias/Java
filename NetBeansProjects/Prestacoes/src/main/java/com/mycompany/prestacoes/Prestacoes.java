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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Digite o preço do produto desejado: ");
        double produto = scan.nextDouble();
        
        System.out.println("Digite em quantas parcelas desejada pagar: ");
        int parcelas =  scan.nextInt();
        
        double valor = produto / parcelas;
        
        System.out.println("Seu pedido foi realizado com sucesso!");
        System.out.println("Valor total do produto: " + produto);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor das parcelas: " + valor);
        scan.close();
        
    }
}
