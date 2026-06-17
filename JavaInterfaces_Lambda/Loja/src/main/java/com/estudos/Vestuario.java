package com.estudos;

class Vestuario implements Produto {

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.025;
    }
}
