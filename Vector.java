/*Sebastian Alejos Acosta
A00344555
Clase Vector
1 de septiembre 2019*/
public class Vector{
    private double i,
                   j, 
                   k;
    
    public Vector(){
        this.i=0;
        this.j=0;
        this.k=0;
    }
    
    public Vector(double x, double y, double z){
        this.i=x;
        this.j=y;
        this.k=z;
    }
    
    public double magnitud(){
        double mag=Math.sqrt((this.i*this.i)+(this.j*this.j)+(this.k*this.k));
        return mag;
    }
    
    public Vector suma(Vector v){
        double xs=this.i+v.i;
        double ys=this.j+v.j;
        double zs=this.k+v.k;
        Vector vs=new Vector(xs,ys,zs);
        return vs;
    }

    public Vector resta(Vector v){
        double xs=this.i-v.i;
        double ys=this.j-v.j;
        double zs=this.k-v.k;
        Vector vs=new Vector(xs,ys,zs);
        return vs;
    }

    public double productoPunto (Vector v){
        double pp=(this.i*v.i)+(this.j*v.j)+(this.k*v.k);
        return pp;
    }

    public Vector productoCruz (Vector v){
        double xs=(this.j*v.k)-(this.k*v.j);
        double ys=(this.k*v.i)-(this.i*v.k);
        double zs=(this.i*v.j)-(this.j*v.i);
        Vector vs=new Vector(xs,ys,zs);
        return vs;
    } 

    public void agregar(Vector v){
        this.i=v.i;
        this.j=v.j;
        this.k=v.k;
    }

    public void imprimeVector(){
        System.out.println("("+this.i+" , "+this.j+" , "+this.k+")");
    }  
}