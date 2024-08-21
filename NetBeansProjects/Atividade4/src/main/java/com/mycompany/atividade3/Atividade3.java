/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

/**
 *
 * @author Aluno
 */
public class Atividade3 {

    public static void main(String[] args) {
        Motoboy pessoa1 = new Motoboy("55555500", "Icaro", "64464467", "2552244548", 2000);
        Engenheiro pessoa2 = new Engenheiro("8888888", "Fuboca", "111111111", "9999999999", 4500);
        Medico pessoa3 = new Medico("77777777", "Rafael", "33333333", "4444444444", 6000);
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
    }
}
