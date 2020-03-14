package app;

public class Retangulo extends Poligono implements Diagonal{

    public Retangulo(double base, double altura){
        super(base, altura);
    }

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
        return Double.parseDouble(String.format("%.2f", (2*getBase())+(2*getAltura())).replace(',', '.'));
    }

}