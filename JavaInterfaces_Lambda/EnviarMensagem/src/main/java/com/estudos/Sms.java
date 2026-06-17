package com.estudos;

public class Sms implements Central {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando SMS");
    }
}
