package com.estudos;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        ligado = false;
        velocidade = 0;
        marcha = 0;
    }

    public void ligar() {

        if (ligado) {
            System.out.println("Carro já está ligado");
            return;
        }

        ligado = true;
        System.out.println("Carro ligado");
    }

    public void desligar() {

        if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("Só pode desligar parado e em ponto morto");
        }
    }

    public void acelerar() {

        if (!ligado) {
            System.out.println("Carro desligado");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não pode acelerar em ponto morto");
            return;
        }

        if (velocidade == 120) {
            System.out.println("Velocidade máxima atingida");
            return;
        }

        if (!validarFaixaVelocidade(velocidade + 1)) {
            System.out.println("Troque de marcha");
            return;
        }

        velocidade++;

        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void frear() {

        if (!ligado) {
            System.out.println("Carro desligado");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
        }

        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void subirMarcha() {

        if (!ligado) {
            System.out.println("Carro desligado");
            return;
        }

        if (marcha == 6) {
            System.out.println("Já está na última marcha");
            return;
        }

        if (!validarFaixaVelocidadeSubir()) {
            System.out.println("Velocidade incompatível");
            return;
        }

        marcha++;

        System.out.println("Marcha atual: " + marcha);
    }

    public void reduzirMarcha() {

        if (!ligado) {
            System.out.println("Carro desligado");
            return;
        }

        if (marcha == 0) {
            System.out.println("Já está em ponto morto");
            return;
        }

        if (!validarFaixaVelocidadeReducao()) {
            System.out.println("Reduza a velocidade primeiro");
            return;
        }

        marcha--;

        System.out.println("Marcha atual: " + marcha);
    }

    public void virar(String direcao) {

        if (!ligado) {
            System.out.println("Carro desligado");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para " + direcao);
        } else {
            System.out.println(
                    "Só pode virar entre 1km/h e 40km/h"
            );
        }
    }

    public void verificarVelocidade() {
        System.out.println(
                "Velocidade atual: "
                        + velocidade
                        + " km/h"
        );
    }

    private boolean validarFaixaVelocidade(int velocidadeNova) {

        return switch (marcha) {
            case 1 -> velocidadeNova <= 20;
            case 2 -> velocidadeNova >= 21 && velocidadeNova <= 40;
            case 3 -> velocidadeNova >= 41 && velocidadeNova <= 60;
            case 4 -> velocidadeNova >= 61 && velocidadeNova <= 80;
            case 5 -> velocidadeNova >= 81 && velocidadeNova <= 100;
            case 6 -> velocidadeNova >= 101 && velocidadeNova <= 120;
            default -> false;
        };
    }

    private boolean validarFaixaVelocidadeSubir() {

        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 20;
            case 2 -> velocidade >= 40;
            case 3 -> velocidade >= 60;
            case 4 -> velocidade >= 80;
            case 5 -> velocidade >= 100;
            default -> false;
        };
    }

    private boolean validarFaixaVelocidadeReducao() {

        return switch (marcha) {
            case 6 -> velocidade <= 100;
            case 5 -> velocidade <= 80;
            case 4 -> velocidade <= 60;
            case 3 -> velocidade <= 40;
            case 2 -> velocidade <= 20;
            case 1 -> velocidade == 0;
            default -> true;
        };
    }

}