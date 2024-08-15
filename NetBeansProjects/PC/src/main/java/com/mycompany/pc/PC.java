/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc;

/**
 *
 * @author Aluno
 */
public class PC {

    public static void main(String[] args) {
        PlacaMae placaMae1 = new PlacaMae("AMD Socket sTR5 para Ryzen™ Threadripper™ PRO 7000 WX-Series", "ASUS", "PRO-WS-WRX90E-SAGE-SE");
        Processador processador1 = new Processador("5.8 Ghz", "Intel", "I9 14900K ");
        Memoria memoria1 = new Memoria("32 Gb", "6400 MHz", "Kingston", "FURY Renegade");
        DispositivoDeArmazenamento dispositivoDeArmazenamento1 = new DispositivoDeArmazenamento("2 TB", "NVME", "Kingston", "SSD M.2");
        
        System.out.println("Dados da Placa Mãe: ");
        System.out.println("Marca: " + placaMae1.getMarca());
        System.out.println("Modelo: " + placaMae1.getModelo());
        System.out.println("Soquete: " + placaMae1.getSoquete());
        
        System.out.println("\nDados do Processador: ");
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
        System.out.println("Frequência: " + processador1.getFrequecia());
        
        System.out.println("\nDados da Mémoria: ");
        System.out.println("Marca: " + memoria1.getMarca());
        System.out.println("Modelo: " + memoria1.getModelo());
        System.out.println("Capacidade de Armazenamento: " + memoria1.getCapacidadeArmazenamento());
        System.out.println("Frequência: " + memoria1.getFrequencia());
        
        System.out.println("\nDados do Armazenamento: ");
        System.out.println("Marca: " + dispositivoDeArmazenamento1.getMarca());
        System.out.println("Modelo: " + dispositivoDeArmazenamento1.getModelo());
        System.out.println("Capacidade de Armazenamento: " + dispositivoDeArmazenamento1.getCapacidadeArmazenamento());
        System.out.println("Tipo Conexão: " + dispositivoDeArmazenamento1.getTipoConexao());
        
    }
}
