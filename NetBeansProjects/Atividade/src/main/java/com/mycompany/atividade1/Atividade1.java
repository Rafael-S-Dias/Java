/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

import com.mycompany.atividade.UnidadeFederativa;
import com.mycompany.atividade.Sexo;
import com.mycompany.atividade.Pessoa;
import com.mycompany.atividade.Endereco;

/**
 *
 * @author Samsung
 */
public class Atividade1 {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Numa Pompílio Bittencourt", "644", "Qd 07 Lote 10", "41100-170", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoa1 = new Pessoa(228644, "Rafael", 23, "719888888", "Rafael@...", Sexo.MASCULINO, endereco1);
        
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("ID: " + pessoa1.getId());
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");
        System.out.println("Sexo: " + pessoa1.getSexo().getTexto());
        System.out.println("\nEndereço: ");
        System.out.println("Logradouro: " + endereco1.getLogradouro());
        System.out.println("Número: " + endereco1.getNumero());
        System.out.println("Complemento: " + endereco1.getComplemento());
        System.out.println("CEP: " + endereco1.getCep());
        System.out.println("Cidade: " + endereco1.getCidade());
        System.out.println("UF: " + endereco1.getUf().getSigla());
    }
}
