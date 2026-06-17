package com.estudos;

public class Main {
    public static void main(String[] args) {
        Sms numero = new Sms();
        Email gmail = new Email();
        Whatsapp Carlos = new Whatsapp();
        RedeSocial Instagram = new RedeSocial();

        numero.enviarMensagem();
        gmail.enviarMensagem();
        Carlos.enviarMensagem();
        Instagram.enviarMensagem();
    }
}