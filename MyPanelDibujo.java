import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
//dibujo vamoosh;

public class MyPanelDibujo extends JPanel implements Runnable, MouseListener, MouseMotionListener
{
	private Image fondo,
				  pocoyo;
	private int xV,
				yV,
				xS,
				yS;
	private String nombre;
	private Thread hilo;
	private boolean mover;
	private Color colorGlobo;
	private BolitaGrafica[] asteroides;
	public MyPanelDibujo() {
		super();
		this.mover=false;
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(800,600));
		this.fondo=new ImageIcon("planeta.jpg").getImage();
		this.pocoyo=new ImageIcon("pocoyo.png").getImage();
		this.xV=this.yV=0;
		this.xS=70;
		this.yS=515;
		this.nombre="Pocoyo";
		this.asteroides=new BolitaGrafica[20];
		for (int i = 0; i < this.asteroides.length; i++) {
			this.asteroides[i]=new BolitaGrafica();
		}
		this.hilo=new Thread(this);
		this.hilo.start();
		colorGlobo=Color.RED;
	}
	
	private void dibujaCabina(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillOval(this.xV+50, this.yV+450, 200, 100);
		g.setColor(Color.CYAN);
		g.fillArc(this.xV+50, this.yV+450, 200, 100, 0, 110);
	}
	private void dibujaAsteroides(Graphics g) {
		for (int i = 0; i < asteroides.length; i++) {
			this.asteroides[i].pinta(g);
		}
	}
	private void dibujaGlobo(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(this.xV+100, this.yV+457,this.xV+100,this.yV+400);
		g.setColor(colorGlobo);
		g.fillOval(this.xV+50, this.yV+300, 100, 100);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(this.fondo, 0, 0, this.getWidth(), this.getHeight(), this);
		g.drawImage(this.pocoyo, this.xV+160, this.yV+460, 40,40,this);
		this.dibujaCabina(g);
		this.dibujaGlobo(g);
		g.setColor(Color.BLACK);
		g.drawString("Vamos "+this.nombre+"!",this.xS,this.yS);
		this.dibujaAsteroides(g);
	
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
		this.repaint();
	}

	
	public void setYv(int yV){
		this.yV=yV;
		this.repaint();
	}
	
	public void setColorGlobo(Color colorGlobo) {
		this.colorGlobo=colorGlobo;
		this.repaint();
		
	}
	public void run(){
		while(this.xV<=550){
			try {
				Thread.sleep(10);
				if(this.mover) {
					this.xV+=2;
					this.yV--;
					this.repaint();
				}
			}catch(InterruptedException ex) {
				System.out.println("No pude despertar!");
			}
		}
	}


	public void mouseClicked(MouseEvent e) {
		this.mover=true;
	}


	public void mousePressed(MouseEvent e) {
		
		
	}


	public void mouseReleased(MouseEvent e) {
		
	}


	public void mouseEntered(MouseEvent e) {
		
		
	}
	public void mouseExited(MouseEvent e) {
		
		
	}

	
	public void mouseDragged(MouseEvent evt) {
		this.xS=evt.getX();
		this.yS=evt.getY();
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}