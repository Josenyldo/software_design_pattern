package org.example;

/**
 O exemplo a seguir, escrito em Java, implementa uma classe gráfica,
 na qual, pode ser uma elipse ou um círculo ou uma composição de diversas outras formas
 geometrias, que, todas podem ser representadas no gráfico.

 Ele pode ser estendido para implementar diversos outras formas
 (círculo, quadrado, etc.) no gráfico.
 **/

import java.util.List;
import java.util.ArrayList;

/** "Component" **/
interface Graphic {

    //Printa o grafico.
    public void print();
    public double perimetro();
    public double area();
}

/** "Composite" **/

class CompositeGraphic implements Graphic {

    //Coleção de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    @Override
    public double perimetro() {
        double perimetro_todo = 0;
        for (Graphic graphic : childGraphics) {
            perimetro_todo += graphic.perimetro();
        }
        return(perimetro_todo);
    }

    public double area() {
        double area_todo = 0;
        for (Graphic graphic : childGraphics) {
            area_todo += graphic.area();
        }
        return(area_todo);
    }


    //Adiciona o grafico a composição.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Remove a forma geometrica da composição.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

}

/** "Leaf" **/
class Ellipse implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Ellipse");
    }

    @Override
    public double perimetro() {
        return (3);
    }

    public double area() {
        return(2);
    }
}

/** "Leaf" **/
class Circle implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Circle");
    }

    @Override
    public double perimetro() {
        return (3);
    }

    public double area() {
        return(3.1415);
    }
}

class Quadrado implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Quadrado");
    }

    @Override
    public double perimetro() {
        return (8);
    }

    public double area() {
        return(4);
    }
}
class Triangulo implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Triangulo");
    }

    @Override
    public double perimetro() {
        return (10);
    }

    public double area() {
        return(6);
    }
}

/** Client **/
public class ClienteComposite {

    public static void main(String[] args) {
        //Inicializa quatro elipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Inicializa tres componentes do grafico.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Faz o grafico
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        System.out.println("Graphic1 Area: " + graphic1.area());
        System.out.println("Graphic1 Perímetro: " + graphic1.perimetro());

        graphic2.add(ellipse4);

        System.out.println("Graphic2 Area: " + graphic2.area());
        System.out.println("Graphic2 Perímetro: " + graphic2.perimetro());

        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(new Circle());
        // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();

        System.out.println("Graphic Area: " + graphic.area());
        System.out.println("Graphic Perímetro: " + graphic.perimetro());

        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(new Quadrado());


        // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();

        System.out.println("Graphic Area: " + graphic.area());
        System.out.println("Graphic Perímetro: " + graphic.perimetro());
        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(new Triangulo());
        // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();

        System.out.println("Graphic Area: " + graphic.area());
        System.out.println("Graphic Perímetro: " + graphic.perimetro());

    }
}