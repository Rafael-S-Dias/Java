/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade8;

/**
 *
 * @author Aluno
 */
public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
       return "Au Au";
    }

    @Override
    public String comer() {
        return "Carne";
    }
    
}
