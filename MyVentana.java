import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MyVentana extends JFrame{
	public MyVentana() {
		super("Mi primer ventanita en Java");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyPanelDibujo pd=new MyPanelDibujo();
		this.add(pd);
		this.add(new MyPanelControles(pd),BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}	
	public static void main(String[] args) {
		MyVentana ventana =new MyVentana();
	}

}

