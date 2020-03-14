package app;

public class Losango extends Poligono{

    public Losango(double base, double altura){
        super(base, altura);
    }

    @Override
    public double perimetro() {
        Double hipPow = Math.pow(getBase()/2, 2) * Math.pow(getAltura()/2, 2);  
        double verticeLosango = Math.sqrt(hipPow);
        return 4*verticeLosango;
    }

}