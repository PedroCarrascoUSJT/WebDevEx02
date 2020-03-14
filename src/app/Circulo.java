package app;

public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio){
        setRaio(raio);
    }

    @Override
    public double area(){
        Double area = getRaio()*(Math.PI*Math.PI);
        return Double.parseDouble(String.format("%.2f", area).replace(',', '.'));
    }

    @Override
    public double perimetro(){
        Double perimetro = (2*getRaio())*Math.PI;
        return Double.parseDouble(String.format("%.2f", perimetro).replace(',', '.'));
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

}