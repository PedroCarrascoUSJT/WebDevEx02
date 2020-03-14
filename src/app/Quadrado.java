package app;


public class Quadrado extends Poligono implements Diagonal{

    public Quadrado(double base){
        super(base, base);
    }

    @Override
    public double calculaDiagonal(){
        double hip = Math.sqrt(
            (
                (getAltura()*getAltura())+
                (getBase()*getBase())
            )
        );
        return Double.parseDouble(String.format("%.2f",hip).replace(',', '.'));
    }

    @Override
    public double perimetro() {
        return Double.parseDouble(String.format("%.2f", 4*getBase()).replace(',', '.'));
    }
}