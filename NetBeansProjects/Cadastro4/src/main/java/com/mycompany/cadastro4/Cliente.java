/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro4;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa{
    
    private String dataDeCompra;
    private String formaDePagamento;

    public Cliente(String dataDeCompra, String formaDePagamento, String nome, int idade) {
        super(nome, idade);
        this.dataDeCompra = dataDeCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }
    
}
