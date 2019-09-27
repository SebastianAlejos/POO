import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
public class MyVentana  extends JFrame{
    public MyVentana(){
        super("Mi primer ventana en Java! :D");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new MyPanelDibujo());
        this.pack();
        this.setVisible(true);
    }
    
           public static void main(String[] args) {
           MyVentana ventana=new MyVentana();
       }
}