public class Figura{
    public double perimetro(){
    return 0.0;
    }

    public double area(){
        return 0.0;
    }

    public double volumen(){
        return 0.0;
    }

    public String toString(){
        return "Figura abstracta";
    }
    public static void main(String[] args) {
        Figura a=new Figura();
        System.out.println(a);
        System.out.println("El perimetro es "+a.perimetro());
        System.out.println("El area es "+a.area());
        System.out.println("El volumen es "+a.volumen());
        System.out.println();


        Rectangulo b=new Rectangulo();
        System.out.println(b);
        System.out.println("El perimetro es "+b.perimetro());
        System.out.println("El area es "+b.area());
        System.out.println("El volumen es "+b.volumen());
    }
}