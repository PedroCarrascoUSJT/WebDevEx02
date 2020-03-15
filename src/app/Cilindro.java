package app;

public class Cilindro extends CorpoRedondo{

    private double altura;

    public Cilindro(double raio, double altura){
        super(raio);
        setAltura(altura);
    }

    @Override
    public double area() {
        return roundDouble((2*super.area())+(2*Math.PI * getRaio() * getAltura()));
    }

    @Override
    public double volume() {
        return super.area()*getAltura();
    }

    @Override
    public double perimetro() {
        return roundDouble((2 * super.perimetro() * getAltura()) + 2*(super.area()));
    }

    //#region Acessores e Modificadores

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //#endregion
}