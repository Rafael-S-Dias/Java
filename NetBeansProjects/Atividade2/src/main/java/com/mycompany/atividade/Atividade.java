/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

/**
 *
 * @author Aluno
 */
public class Atividade {

    public static void main(String[] args) {
         
        Funcionario pessoa1 = new Funcionario(234486, "Rafael", 23, "4444444444", "22222222", "22446688", "02/08/2001", Setor.JURIDICO, 5000, "719888888", "Rafael@outlook.com", Sexo.MASCULINO,
        new Endereco("Rua Numa Pompílio Bittencourt", "644", "Qd 07 Lote 10", "55555555", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(pessoa1.toString());
    }
}
