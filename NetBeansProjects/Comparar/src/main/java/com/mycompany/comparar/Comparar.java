/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparar;

/**
 *
 * @author Aluno
 */
public class Comparar {

    public static void main(String[] args) {
        String nomeUsuario = "Rafael";
        int senha = 1234;
        
        // Comparação String e int
        boolean resultadoNome = nomeUsuario.equals("Rafael");
        boolean resultadoSenha = (senha == 1234);
        
        // Resultados
        System.out.println("O noem do usúario está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
