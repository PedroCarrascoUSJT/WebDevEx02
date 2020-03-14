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
        return hip;
    }

    @Override
    public double perimetro() {
        return 4*getBase();
    }
}