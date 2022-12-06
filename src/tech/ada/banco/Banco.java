package tech.ada.banco;

//menu
//conta
//cliente
// gerente
//pessoa

import java.util.Scanner;

/**
 * Sacar dinheiro
 * Depositar dinheiro
 * Transferir
 * Abrir uma conta
 * Tomar um emprestimo
 */

public class Banco {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao Banco Ada");

        Pessoa pessoa1 = new Pessoa("Kassia","23/12/1975","25199199433","1199468051");

        //pessoa1 = getNome();

        System.out.println("O nome da pessoa1 é " + pessoa1.nome);
        System.out.println("A data de nascimento da pessoa1 é  " + pessoa1.dataNascimento);
        System.out.println("O CPF da pessoa1 é " + pessoa1.cpf);
        System.out.println("O telefone da pessoa1 é " + pessoa1.telefone);

    }

    private static String getNome() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome ");
        return entrada.nextLine();
    }

}