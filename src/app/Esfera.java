package app;

public class Esfera extends CorpoRedondo{

    public Esfera(double raio){
        super(raio);
    }

    @Override
    public double volume() {
        return roundDouble(super.volume()*(4/3));
    }

    @Override
    public double area() {
        return roundDouble(super.area()*4);
    }
}