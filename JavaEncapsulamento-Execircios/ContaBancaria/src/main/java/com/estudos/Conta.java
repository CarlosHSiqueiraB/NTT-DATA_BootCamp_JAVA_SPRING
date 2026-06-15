package com.estudos;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double valorUsadoCheque;


    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        if (saldoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = saldoInicial * 0.5;
        }

        this.valorUsadoCheque = 0;
    }


    public void Depositar(double valor) {
        saldo += valor;
        if (valorUsadoCheque > 0) {

            double taxa = valorUsadoCheque * 0.2;

            if (saldo >= taxa) {
                saldo -= taxa;

                System.out.println(
                        "Taxa do cheque especial cobrada: " + taxa
                );

                valorUsadoCheque = 0;
            }
        }
    }

    public void Sacar(double valor) {
        double limiteTotal = saldo + chequeEspecial;

        if (valor > limiteTotal) {
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo -= valor;

        // Entrou no cheque especial
        if (saldo < 0) {
            valorUsadoCheque = Math.abs(saldo);
        }

        System.out.println("Saque realizado");
    }

    public void PagarBoleto(double valor) {
        Sacar(valor);
    }

    public void ConsultarSaldo() {
        System.out.println("O Saldo atual é: " + saldo);
    }

    public void ConsultarCheque() {
        System.out.println("O saldo do cheque especial é: " + chequeEspecial);
    }

    public void VerificarChequeEspecial() {

        if (valorUsadoCheque > 0) {
            System.out.println("Conta usando cheque especial");
        } else {
            System.out.println("Conta NÃO está usando cheque especial");
        }
    }

}
