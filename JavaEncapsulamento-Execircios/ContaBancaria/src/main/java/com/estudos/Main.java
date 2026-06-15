package com.estudos;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(350);

        conta.ConsultarSaldo();
        conta.Sacar(400);
        conta.VerificarChequeEspecial();
        conta.Depositar(200);
        conta.ConsultarSaldo();
    }
}