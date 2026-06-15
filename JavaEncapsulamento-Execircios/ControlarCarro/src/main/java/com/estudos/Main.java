package com.estudos;

// Odeio exercício assim, muito código
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ligar();

        carro.subirMarcha();

        carro.acelerar();
        carro.acelerar();

        carro.verificarVelocidade();

        carro.virar("direita");

        carro.frear();
        carro.frear();

        carro.reduzirMarcha();

        carro.desligar();
    }
}