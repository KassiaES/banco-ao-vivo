package tech.ada.banco.services;

import tech.ada.banco.model.Conta;
import tech.ada.banco.utils.LeitorTeclado;

public class MostrarSaldo {

    public static void executar() {
        int numeroConta = LeitorTeclado.getNumero("Digite um número de conta.");
        Conta conta = Conta.obtemContaPeloNumero(numeroConta);
        System.out.println("O saldo da conta é de: R$" + conta.getSaldo());

    }
    public void executar(int numeroConta) {
        Conta conta = Conta.obtemContaPeloNumero(numeroConta);
        System.out.println("O saldo da conta é de: R$" + conta.getSaldo());
    }

    public void executar(Conta conta) {
        System.out.println("O saldo da conta é de: R$" + conta.getSaldo());
    }

}
