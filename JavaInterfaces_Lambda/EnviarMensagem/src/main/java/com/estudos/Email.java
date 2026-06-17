package com.estudos;

public class Email implements Central {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Email");
    }
}
