package org.example;

public class Coisa {
    private String nome = "Ainda Sem Nome";
    public Coisa() {
        this("Coisa Sem Sentido");
        System.out.println("Padraão");
    }
    public Coisa(String nome) {
        this.nome = nome;
        System.out.println("Novo");
    }
    public Coisa(String nome, int d ) {
        this.nome = nome;
        System.out.println("Novdsado");
    }
}