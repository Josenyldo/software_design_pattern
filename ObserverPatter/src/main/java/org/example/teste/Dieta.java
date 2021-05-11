package org.example.teste;
import java.util.List;
import java.util.ArrayList;

import java.util.Observable;
import java.util.Observer;
public class Dieta implements Observable {
    private List observers = new ArrayList();
    private double peso;

    public Dieta(double peso) {
        this.peso = peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        // Quando a alteração do peso ocorrer, esse é o momento correto para notificar os observers.
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // Chama o método de atualização de todos os observers disponíveis.
        for (Observer ob : observers) {
            System.out.println("Notificando observers!");
            ob.update(this.peso);
        }
    }
}
