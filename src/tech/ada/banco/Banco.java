package tech.ada.banco;
// menu
// conta
// cliente
// gerente
// pessoa

import tech.ada.banco.services.*;
import tech.ada.banco.utils.LeitorTeclado;

/**
 * Sacar dinheiro
 * Depositar dinheiro
 * Transferir
 * Abrir uma conta
 * Tomar um emprestimo
 */

public class Banco {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco Ada.");
        Pix pix = new Pix();
        Deposito deposito = new Deposito();
        boolean ligado = true;
        while (ligado) {
            menu();
            int opcao = LeitorTeclado.getNumero("Digite uma das opções.");
            switch (opcao) {
                case 0:
                    System.out.println("O programa será finalizado. Te vejo depois!");
                    ligado = false;
                    break;

                case 1:
                    AberturaDeConta.executar();
                    break;

                case 2:
                    deposito.executar();
                    break;

                case 3:
                    Saque.executar();
                    break;

                case 4:
                    pix.transferirDinheiro();
                    break;

                case 5:
                    MostrarSaldo.executar();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("Escolha uma das opções abaixo.");
        System.out.println("0 - Para Encerrar.");
        System.out.println("1 - Para abrir uma conta.");
        System.out.println("2 - Para depositar um valor.");
        System.out.println("3 - Para retirar um valor.");
        System.out.println("4 - Para realizar uma transferência via PIX.");
        System.out.println("5 - Obter saldo da conta.");

    }
}



//      Estudo de como formatar uma data
//      como eu já havia feito com get e set eu alterei meu get pra retornar uma String formatada.
//      public String getDataNascimento() {
//      return
//      dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//
//      Dessa forma:
//      this(nome, LocalDate.parse(dataNascimento,DateTimeFormatter.ofPattern("dd/MM/yyyy")), cpf);
//      Nesse caso você tá convertendo para a String enviada dentro do seu construtor e armazenando no formato que o LocalDate aceite