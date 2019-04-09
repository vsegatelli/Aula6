package br.com.digitalhouse;

public abstract class Animal {

    private String tamanho;
    private String raca;

    // Construtor
    public Animal() {
    }

    //Construtor
    public Animal(String novoTamanho, String novaRaca) {
        tamanho = novoTamanho;
        raca = novaRaca;
    }
    // Getter and Setters
    public void setTamanho (String novoTamanho){
        tamanho = novoTamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

        public void setRaca(String novaRaca){
            raca = novaRaca;
            }

            public String getRaca(){
            return raca;
    }

    //Métodos
    public abstract boolean ehMamifero();
    }


