public class Rectangulo extends Figura{
    protected double largo,   
                            ancho;

    public Rectangulo(double largo, double ancho){
        this.ancho=ancho;
        this.largo=largo;
    }

    public Rectangulo(){
        this(10,4);
    }
    
    public double perimetro(){
        return 2.0*(this.largo+this.ancho);
    }

    public double area(){
        return this.largo*this.ancho;
    }
    public String toString(){
        return "Rectangulo con largo "+this.largo +" y ancho "+this.ancho;
    }

}