/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade7;


/**
 *
 * @author Aluno
 */
public class Fornecedor extends Juridica{
    private String produto;

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n\nDados do Fornecedor: " + 
                super.toString() +
                "Produto: " + produto;
    }
    
    
}
