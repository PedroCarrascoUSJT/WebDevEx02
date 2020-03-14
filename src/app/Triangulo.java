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
        double cateto = getBase()/2;
        double hip = Math.sqrt((cateto*cateto) + (getAltura()*getAltura()));
        double perimetro = (hip*2) + getBase();
        return Double.parseDouble(String.format("%.2f", perimetro).replace(',', '.'));
    }
}