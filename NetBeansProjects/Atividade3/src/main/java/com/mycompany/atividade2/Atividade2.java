/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

/**
 *
 * @author Aluno
 */
public class Atividade2 {

    public static void main(String[] args) {
        Juridica pessoa1 = new Juridica("22525252525", "64764976494", "Rafael", "71988888");
        Fisica pessoa2 = new Fisica("858446544", "1154561", "02/08/2001", "Rafael", "719999999");
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
