package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {

        //Criando o objeto
        Cachorro cachorro = new Cachorro("Bidu","20", "Vira-Lata");

        System.out.println("Esse cachorro é mamífero? " + cachorro.ehMamifero());


    }
}
