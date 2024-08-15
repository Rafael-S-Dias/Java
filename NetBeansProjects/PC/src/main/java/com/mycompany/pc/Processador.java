/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc;

/**
 *
 * @author Aluno
 */
public class Processador extends Especificacoes {
    private String frequecia;

    public Processador(String frequecia, String marca, String modelo) {
        super(marca, modelo);
        this.frequecia = frequecia;
    }

    public String getFrequecia() {
        return frequecia;
    }

    public void setFrequecia(String frequecia) {
        this.frequecia = frequecia;
    }
    
}
