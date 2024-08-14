/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.cadastro;

/**
 *
 * @author Aluno
 */
public class Veiculos {

    private String placa;
    private String cor;
    private int passageiros;
    private String capacidade;
    private String max_velocidade;
    private String consumo;

    public Veiculos(String placa, String cor, int passageiros, String capacidade, String max_velocidade, String consumo) {
        this.placa = placa;
        this.cor = cor;
        this.passageiros = passageiros;
        this.capacidade = capacidade;
        this.max_velocidade = max_velocidade;
        this.consumo = consumo;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getMax_velocidade() {
        return max_velocidade;
    }

    public void setMax_velocidade(String max_velocidade) {
        this.max_velocidade = max_velocidade;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
    }
