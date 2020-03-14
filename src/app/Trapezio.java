package app;

public class Trapezio extends Poligono{

    private double baseMenor;

    public Trapezio(double baseMaior,double baseMenor, double altura){
        super(baseMaior, altura);
        setBaseMenor(baseMenor);
    }

    @Override
    public double area(){
        return (((getBaseMenor()*getAltura())+super.area())/2);
    }

    @Override
    public double perimetro() {
        double cateto = (getBase() - getBaseMenor())/2;

        double hip = Math.sqrt((cateto*cateto) + (getAltura()*getAltura()));

        double perimetro = getBase() + getBaseMenor() + (2*hip);

        return Double.parseDouble(String.format("%.2f", perimetro).replace(',', '.'));
    }

    /**
     * @return the baseMenor
     */
    public double getBaseMenor() {
        return baseMenor;
    }

    /**
     * @param baseMenor the baseMenor to set
     */
    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
}