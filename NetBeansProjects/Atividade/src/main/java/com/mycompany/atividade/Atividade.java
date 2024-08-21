/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

/**
 *
 * @author Aluno
 */
public class Atividade {

    public static void main(String[] args) {
         
        Funcionario pessoa1 = new Funcionario(234486, "Rafael", 23, "4444444444", "22222222", "22446688", "02/08/2001", Setor.JURIDICO, 5000, "719888888", "Rafael@outlook.com", Sexo.MASCULINO,
        new Endereco("Rua Numa Pompílio Bittencourt", "644", "Qd 07 Lote 10", "55555555", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("Dados do Funcinário: ");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("ID: " + pessoa1.getId());
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");
        System.out.println("Data de Nascimento: " + pessoa1.getDataNascimento());
        System.out.println("CPF: " + pessoa1.getCpf()); 
        System.out.println("RG: " + pessoa1.getRg());
        System.out.println("Matrícula: " + pessoa1.getMatricula());
        System.out.println("Sexo: " + pessoa1.getSexo().getTexto() + " | " + pessoa1.getSexo().getCaracter());
        System.out.println("Setor: " + pessoa1.getSetor().getNome());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Salario: R$" + pessoa1.getSalario());
        
        System.out.println("\nEndereço: ");
        System.out.println("Logradouro: " + pessoa1.getEndereco().getLogradouro());
        System.out.println("Número: " + pessoa1.getEndereco().getNumero());
        System.out.println("Complemento: " + pessoa1.getEndereco().getComplemento());
        System.out.println("CEP: " + pessoa1.getEndereco().getCep());
        System.out.println("Cidade: " + pessoa1.getEndereco().getCidade());
        System.out.println("UF: " + pessoa1.getEndereco().getUf().getSigla() + " | " + pessoa1.getEndereco().getUf().getNome());
    }
}
