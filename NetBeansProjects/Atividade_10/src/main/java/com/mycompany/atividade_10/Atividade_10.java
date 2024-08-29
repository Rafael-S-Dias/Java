/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_10;

/**
 *
 * @author Aluno
 */
public class Atividade_10 {

    public static void main(String[] args) {
        Mototboy motoboy1 = new Mototboy("258744", "Icaro", "05/09/2003", Sexo.MASCULINO, Setor.OPERACOES, 1800);
        Diretor diretor1 = new Diretor("Rafael", "02/08/2001", Sexo.MASCULINO, Setor.FINANCEIRO, 3500);
        
        System.out.println(motoboy1.toString());
        System.out.println(diretor1.toString());
        
        diretor1.demitir(motoboy1);
    }
}
