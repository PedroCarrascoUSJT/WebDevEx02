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
        figuras.add(new Trapezio(10, 5, 6));
        figuras.add(new Esfera(7));
        figuras.add(new Cilindro(6,7));
        figuras.add(new Piramide(5,5,7));
        figuras.add(new Cubo(8));

        int i=0;
        for(Figura figura : figuras){
            i++;
            System.out.println("A figura "+i+":");
            System.out.println("\tÁrea:"+figura.area());
            System.out.println("\tPerimetro:"+figura.perimetro());
            if(figura instanceof Diagonal)
                System.out.println("\tDiagonal:"+((Diagonal)figura).calculaDiagonal());
            if(figura instanceof CorpoRedondo )
                System.out.println("\tVolume:"+((CorpoRedondo)figura).volume());
            if(figura instanceof Poligono3D )
                System.out.println("\tVolume:"+((Poligono3D)figura).volume());
            
        }

    }
}