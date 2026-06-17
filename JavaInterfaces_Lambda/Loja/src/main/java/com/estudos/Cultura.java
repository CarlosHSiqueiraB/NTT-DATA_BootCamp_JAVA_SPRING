package com.estudos;

class Cultura implements Produto {

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.04;
    }
}
