/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

/**
 *
 * @author Aluno
 */
public class Atividade5 {

    public static void main(String[] args) {
        Juridica pessoa1 = new Juridica("44444444", "22222222", "Fuboca", "719888888", "Fuboca@...", 
        new Endereco("Rua ....", "333", "Quadra 10 Lote 50", "41150-810", "Salvador", UnidadeFederativa.BAHIA));
        Fisica pessoa2 = new Fisica(Sexo.MASCULINO, "05/07/1989", "Teago", "71999999", "Teago@...", 
        new Endereco("Avenida Aquatica", "666", "Vovô Naz", "000000", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
