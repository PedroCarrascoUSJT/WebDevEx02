package app;

public class Triangulo extends Poligono{

    public Triangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    public double area(){
        return (super.area()/2);
    }

    @Override
    public double perimetro() {
        return 0;
    }
}