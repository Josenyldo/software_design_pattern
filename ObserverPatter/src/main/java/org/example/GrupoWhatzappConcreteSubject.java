package org.example;
import java.util.Observable;
import java.util.List;
import java.util.ArrayList;


public class GrupoWhatzappConcreteSubject extends Observable{
    private List<UsuarioConcreteObserver> observers = new ArrayList<UsuarioConcreteObserver>();
    public void attache( UsuarioConcreteObserver observer){
        observers.add(observer);
    }

    //public UsuarioConcreteObserver




}
