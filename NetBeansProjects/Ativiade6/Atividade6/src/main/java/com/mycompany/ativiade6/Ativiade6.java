/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativiade6;

/**
 *
 * @author Aluno
 */
public class Ativiade6 {

    public static void main(String[] args) {
        Cliente pessoa1 = new Cliente("N° 222", Sexo.MASCULINO, EstadoCivil.SOLTEIRO, "02/08/2001", "Rafael", "7198888", "Rafael@....", 
                new Endereco("Rua .....", "621", "Qd 7 Lt 10", "41100-170", "Salvador", UnidadeFederativa.BAHIA));
        
        PrestacaoServico pessoa2 = new PrestacaoServico("01/04/2023", "23/12/2024", "45.800.818/0001-27", "02.808.2206-1", "Santiago", "71999999", "Rsd@02....",
                new Endereco("Rua *****", "644", "Edifício ... Apto 200", "411000-170", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
