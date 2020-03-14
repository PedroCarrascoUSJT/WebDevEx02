package app;

import java.util.*;

public class Geometria {
    public static void main(String[] args) throws Exception {
        ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(new Retangulo(6.7,4.5));
        figuras.add(new Losango(10,7));
        figuras.add(new Quadrado(10));
        figuras.add(new Triangulo(10,7));
        figuras.add(new Circulo(3.6));

        int i=0;
        for(Figura figura : figuras){
            i++;
            System.out.println("A figura "+i+" tem como área: ");
            System.out.println(figura.area());
        }

    }
}