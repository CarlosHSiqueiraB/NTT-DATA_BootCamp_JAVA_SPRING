package com.estudos;

class Alimentacao implements Produto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.01;
    }
}
