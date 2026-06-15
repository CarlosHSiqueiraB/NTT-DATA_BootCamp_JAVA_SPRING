package com.estudos;

public class Main {
    public static void main(String[] args) {
        MaquinaBanho maquina = new MaquinaBanho();

        maquina.abastecerAgua();
        maquina.abastecerAgua();
        maquina.abastecerAgua();
        maquina.abastecerAgua();
        maquina.abastecerAgua();

        maquina.abastecerShampoo();
        maquina.abastecerShampoo();

        maquina.colocarPet();

        maquina.darBanho();

        maquina.retirarPet();

        maquina.verificarAgua();

        maquina.verificarShampoo();
    }
}