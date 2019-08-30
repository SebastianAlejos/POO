import javax.swing.JOptionPane;
public class IntroJava{
	public static void calificacion(){
		String strNota=JOptionPane.showInputDialog("Dime la nota obtenida");
		int nota= Integer.parseInt(strNota);
		if (nota>=70){
		System.out.println("Aprobado");
		}else{
		System.out.println("Reprobado");
		}
	}
	
	public static void main(String args[]){
		calificacion();
	}

}