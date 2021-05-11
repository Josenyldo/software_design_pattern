package org.example.atividade;

import java.util.ArrayList;
import java.util.List;

/** "Component" **/
interface Graphic {

    //Printa o grafico.
    public void print();
    public double perímetro();
    public double area();
    public void adicionarGraphics(Quadrado quadrado);
    public void removeGraphics();

}

class Quadrado implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<Graphic>();
    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }


    @Override
    public double perímetro() {
        return (5);
    }

    @Override
    public double area() {
        return (10);
    }

    @Override
    public void adicionarGraphics(Quadrado quadrado) {

    }

    @Override
    public void removeGraphics() {

    }
}

class Circulo implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<Graphic>();
    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    @Override
    public double perímetro() {
        return (10);
    }

    @Override
    public double area() {
        return (20);
    }

    @Override
    public void adicionarGraphics(Quadrado quadrado) {

    }

    @Override
    public void removeGraphics() {

    }
}




public class ClienteComposite {

    public static void main(String[] args){

        Graphic figura = new Quadrado();
        figura.adicionarGraphics(new Quadrado());

    }

}
