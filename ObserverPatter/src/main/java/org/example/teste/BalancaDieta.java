package org.example.teste;
import java.util.Observable;
import java.util.Observer;

class BalancaDieta implements Observer {
    int peso = 50;
    @Override
    public void update(double novoPeso) {
        if (peso >= 100) {
            System.out.println("Você ultrapassou o peso limite no sistema!");
        }
    }


}

