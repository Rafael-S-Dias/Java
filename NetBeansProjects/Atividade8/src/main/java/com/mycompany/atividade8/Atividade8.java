/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade8;

/**
 *
 * @author Aluno
 */
public class Atividade8 {

    public static void main(String[] args) {
        Cachorro thor = new Cachorro();
        Gato bichano = new Gato();
        Galo dodô = new Galo(); 
        Pato donald = new Pato();
        
        System.out.println("Som que o cachorro faz: " + thor.emitirSom() + "/ e o que ele come: " + thor.comer() );
        System.out.println("Som que o gato faz: " + bichano.emitirSom() + "/ e o que ele come: " + bichano.comer());
        System.out.println("Som que o galo faz: " + dodô.emitirSom() + "/ e o que ele come: " + dodô.comer());
        System.out.println("Som que o patoS faz: " + donald.emitirSom() + "/ e o que ele come: " + donald.comer());
    }
}
