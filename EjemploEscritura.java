import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploEscritura{
    public static void main(String[] args) {
        PrintWriter pw=null;
        try{
        pw=new PrintWriter(new FileWriter("nuevo.txt"));
        pw.println("Este es mi primer archivo de texto creado desde java");
        pw.println("hahahahah");
        pw.println("hola");
        pw.flush();
        pw.println("lala");
        }catch(IOException ex){
            System.out.println("No se puede crear el archivo");
        }finally{
            pw.close();
        }
    }
}