package org.example.Padroes;

public class ExemploFone {
    public static void main(String[] args) {
        Telefone fone = new Telefone();
        Pessoa fulano = new Pessoa();
        Pessoa fulano1 = new Pessoa();
        SecretariaEletronica se = new SecretariaEletronica();

        fone.addTelefoneListener(se);
        fone.addTelefoneListener();
        fulano.escutaTelefone(fone);
        fone.tocaFone(); // começa a brincadeira
    }
}