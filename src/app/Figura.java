package app;

public abstract class Figura{

    public abstract double area();

    public abstract double perimetro();

    public double roundDouble(double value){
        return Double.parseDouble(
            String.format("%.2f",value).replace(',', '.')
            );
    }
}