import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class EjemploLectura {

    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("nuevo.txt"));
            String linea;
	    	while((linea = br.readLine())!=null){
			    System.out.println(linea);
		    }
		    br.close();
        } catch (FileNotFoundException ex){
           System.out.println("No se encontró el archivo");
        }catch(IOException ex){
            System.out.println("No se puede cerrar el archivo");
        }
    }
}