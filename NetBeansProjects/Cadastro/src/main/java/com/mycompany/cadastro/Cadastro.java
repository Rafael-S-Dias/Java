/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro;

/**
 *
 * @author Aluno
 */
public class Cadastro {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Gabriel", 23, "Fuboca", "Ilha", "0000000");
        Veiculos veiculos1 = new Veiculos("Lancha-2424", "Azul", 1, "35 ", "200 Km/h", "1200 L");
        
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        
        System.out.println("\n Dados do Veiculo: ");
        System.out.println("Placa: " + veiculos1.getPlaca());
        System.out.println("Cor: " + veiculos1.getCor());
        System.out.println("Passageiros: " + veiculos1.getPassageiros());
        System.out.println("Capaciade: " + veiculos1.getCapacidade());
        System.out.println("Velocidade Maxima: " + veiculos1.getMax_velocidade());
        System.out.println("Consumo Médio: " + veiculos1.getConsumo());
    }
}
