package app;

public abstract class CorpoRedondo extends Figura{
    
    private double raio;

    public CorpoRedondo(double raio){
        setRaio(raio);
    }

    public double volume(){
        return roundDouble(Math.PI * Math.pow(getRaio(), 3));
    }

    public double area(){
        return roundDouble(Math.PI * Math.pow(getRaio(), 2));
    }

    public double perimetro(){
        return roundDouble(2*Math.PI * getRaio());
    }
    

    //#region Acessores e modificadores

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


    //#endregion
    
}