package tech.ada.banco;

//menu
//conta
//cliente
// gerente
//pessoa

import tech.ada.banco.model.Pessoa;
import tech.ada.banco.utils.LeitorTeclado;

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

        LeitorTeclado teclado = new LeitorTeclado();
        int cpf = teclado.getNumero("Digite seu CPF: ");

        Pessoa pessoa1 = new Pessoa("Kassia","1975-12-23","25199199433","1199468051");

        //pessoa1 = getNome();

        System.out.println("O nome da pessoa1 é " + pessoa1.getNome());
        System.out.println("A data de nascimento da pessoa1 é  " + pessoa1.getDataNascimento());
        System.out.println("O CPF da pessoa1 é " + pessoa1.getCpf());
        System.out.println("O telefone da pessoa1 é " + pessoa1.getTelefone());

        System.out.println(pessoa1.toString());

    }

    private static String getNome() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome ");
        return entrada.nextLine();
    }

}

//  como eu já havia feito com get e set eu alterei meu get pra retornar uma String formatada.
//      public String getDataNascimento() {
 //       return
//       dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
 //
//     Dessa forma:
//  this(nome, LocalDate.parse(dataNascimento,DateTimeFormatter.ofPattern("dd/MM/yyyy")), cpf);
//  Nesse caso você tá convertendo para a String enviada dentro do seu construtor e armazenando no formato que o LocalDate aceite