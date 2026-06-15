package com.estudos;

public class MaquinaBanho {

    private int agua;
    private int shampoo;

    private boolean temPet;
    private boolean petLimpo;

    private boolean maquinaSuja;

    public MaquinaBanho() {

        agua = 0;
        shampoo = 0;

        temPet = false;
        petLimpo = false;

        maquinaSuja = false;
    }

    public void colocarPet() {

        if (maquinaSuja) {
            System.out.println("Limpe a máquina antes.");
            return;
        }

        if (temPet) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }

        temPet = true;
        petLimpo = false;

        System.out.println("Pet colocado.");
    }

    public void retirarPet() {

        if (!temPet) {
            System.out.println("Não existe pet.");
            return;
        }

        if (!petLimpo) {
            maquinaSuja = true;
            System.out.println("Pet retirado sujo. Máquina precisa ser limpa.");
        }

        temPet = false;

        System.out.println("Pet removido.");
    }

    public void darBanho() {

        if (!temPet) {
            System.out.println("Não existe pet.");
            return;
        }

        if (agua < 10 || shampoo < 2) {
            System.out.println("Recursos insuficientes.");
            return;
        }

        agua -= 10;
        shampoo -= 2;

        petLimpo = true;

        System.out.println("Banho realizado.");
    }

    public void abastecerAgua() {

        if (agua + 2 > 30) {
            System.out.println("Tanque cheio.");
            return;
        }

        agua += 2;

        System.out.println("Água atual: " + agua + "L");
    }

    public void abastecerShampoo() {

        if (shampoo + 2 > 10) {
            System.out.println("Reservatório cheio.");
            return;
        }

        shampoo += 2;

        System.out.println("Shampoo atual: " + shampoo + "L");
    }

    public void verificarAgua() {

        System.out.println(
                "Água disponível: "
                        + agua
                        + "L"
        );
    }

    public void verificarShampoo() {

        System.out.println(
                "Shampoo disponível: "
                        + shampoo
                        + "L"
        );
    }

    public void verificarPet() {

        if (temPet) {
            System.out.println("Existe pet na máquina.");
        } else {
            System.out.println("Máquina vazia.");
        }
    }

    public void limparMaquina() {

        if (!maquinaSuja) {
            System.out.println("Máquina já está limpa.");
            return;
        }

        if (agua < 3 || shampoo < 1) {
            System.out.println("Recursos insuficientes.");
            return;
        }

        agua -= 3;
        shampoo -= 1;

        maquinaSuja = false;

        System.out.println("Máquina limpa.");
    }

}