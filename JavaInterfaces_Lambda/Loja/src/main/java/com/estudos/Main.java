package com.estudos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double valor = 100;

        Produto alimento = new Alimentacao();
        Produto saude = new SaudeBemEstar();
        Produto roupa = new Vestuario();
        Produto cultura = new Cultura();

        System.out.println("Imposto Alimentação: " + alimento.calcularImposto(valor));
        System.out.println("Imposto Saúde: " + saude.calcularImposto(valor));
        System.out.println("Imposto Vestuário: " + roupa.calcularImposto(valor));
        System.out.println("Imposto Cultura: " + cultura.calcularImposto(valor));
    }
}