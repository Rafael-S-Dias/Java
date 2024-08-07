/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livros;

/**
 *
 * @author Aluno
 */
public class Livros {

    public static void main(String[] args) {
    
    Informações livro1 = new Informações("Fogo e Sangue", "George R.R.Martin", 664, 80);
    
        System.out.println("Título do livro: " + livro1.getTitulo());
        System.out.println("Nome do autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getPaginas());
        System.out.println("Preço: R$" + livro1.getPreco());
    }
}
