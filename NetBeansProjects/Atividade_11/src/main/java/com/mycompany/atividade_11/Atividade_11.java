/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_11;

/**
 *
 * @author Aluno
 */
public class Atividade_11 {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("1111", "222", "333", "444", "Salvador", UnidadeFederativa.BAHIA);
        Endereco endereco2 = new Endereco("2222", "333", "444", "555", "Sampa", UnidadeFederativa.SAO_PAULO);
        //Motorista motorista1 = new Motorista("55555", "Rafael", "6666666", "77777", endereco1, Setor.JURIDICO, Sexo.MASCULINO, 4000, "02/08/2001");
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Rafael", "55555555", "7676767", endereco1, Setor.JURIDICO, Sexo.MASCULINO, 6000, "02/08/2001");
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Icaro", "88888", "99999", endereco2, Setor.OPERACOES, Sexo.FEMININO, 5000, "06/01/2003");
        
        //System.out.println(motorista1.toString());
        System.out.println(gerente1.toString());
        System.out.println(diretor1.toString());
    
    
    
    }
}
