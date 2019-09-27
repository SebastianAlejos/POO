import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class MyPanelDibujo  extends JPanel implements Runnable{
    private int xV,
                     yV;

    public MyPanelDibujo(){
        super();
        this.setPreferredSize(new Dimension(800,600));
        this.xV=0;
        this.xV=0;
        Thread hilo=new Thread(this);
        hilo.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(50+this.xV,400+this.yV,200,100);
        g.setColor(Color.CYAN);
        g.fillArc(50+this.xV,400+this.yV,200,100,0,110);
        g.setColor(Color.BLACK);
        g.drawLine(100+this.xV,407+this.yV,100+this.xV,300+this.yV);
        g.setColor(Color.RED);
        g.fillOval(50+this.xV,200+this.yV,100,100);
    }

    public void run(){
        while(this.xV<550){
            try{
            this.xV+=2;
            this.yV--;
            this.repaint();
            Thread.sleep(10);
            }catch(InterruptedException ex ){
                System.out.println("No pude despertar al vamoosh!");
            }
        }
    }
}