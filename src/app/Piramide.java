package app;

public class Piramide extends Poligono3D{

    private double hipotenusa;

        public Piramide(double width, double height, double length){
            super(width,height,length);
            calcHipotenusa();
        }

        @Override
        public double volume() {
            return super.volume()/3;
        }

        @Override
        public double area() {
            double area = (getLength()*getWidth()) + (getHipotenusa()*8);
        return area;
        }

        @Override
        public double perimetro() {
            return (4*getHipotenusa())+getLength();
        }

        private double calcHipotenusa(){
            double largura = getLength()/2;
            hipotenusa = Math.sqrt((getHeight()*getHeight())+(largura*largura));
            return hipotenusa;
        }

        /**
         * @return the hipotenusa
         */
        public double getHipotenusa() {
            return hipotenusa;
        }

        /**
         * @param hipotenusa the hipotenusa to set
         */
        public void setHipotenusa(double hipotenusa) {
            this.hipotenusa = hipotenusa;
        }
}