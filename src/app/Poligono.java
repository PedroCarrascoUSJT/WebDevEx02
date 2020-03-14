package app;

import java.text.DecimalFormat;

public abstract class Poligono extends Figura{

    private double base;
    private double altura;

    public Poligono(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    @Override
    public double area(){
        Double area = getBase()*getAltura();
        return Double.parseDouble(String.format("%.2f", area).replace(',', '.'));
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }
    

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

}