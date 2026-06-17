package com.estudos;

class SaudeBemEstar implements Produto {

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.015;
    }
}
