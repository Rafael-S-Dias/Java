/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ativiade6;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private String texto;
    private char caracter;

    private Sexo(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public char getCaracter() {
        return caracter;
    }

    public String getTexto() {
        return texto;
    }

}
