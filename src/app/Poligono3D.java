package app;

public abstract class Poligono3D extends Figura{

    private double width;
    private double length;
    private double height;  
    
    public Poligono3D(double width, double height, double length){
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    public double volume(){
        return getHeight()*getLength()*getWidth();
    }

    @Override
    public double area() {
        return 6*(getWidth()*getHeight());
    }

    @Override
    public double perimetro() {
        return getHeight()*12;
    }

    //#region Métodos acessores/modificadores

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }
    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    //#endregion
}