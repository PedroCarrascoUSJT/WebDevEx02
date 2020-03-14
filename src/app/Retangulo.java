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
        return hip;
    }

    @Override
    public double perimetro() {
        // TODO Auto-generated method stub
        return 0;
    }

}