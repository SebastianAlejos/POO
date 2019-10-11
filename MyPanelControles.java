import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MyPanelControles extends JPanel{
	private JTextField tfNombre;
	private JButton btnNombre,
					btnColor,
					btnGuardar,
					btnAbrir;
	private JRadioButton rbRojo,
						 rbVerde,
						 rbAzul;
						
	private MyPanelDibujo pd;
	private JPanel panelColor;
	private JSlider slider;
	 
	
	
	
	public MyPanelControles(MyPanelDibujo pd){
		super();
		this.pd=pd;
		this.setPreferredSize(new Dimension(150,600));
		this.tfNombre=new JTextField(10);
		this.btnNombre=new JButton("Saluda");
		this.btnNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				pd.setNombre(tfNombre.getText());
			}
		});
		
		this.rbRojo=new JRadioButton("Color Rojo",true);
		this.rbVerde=new JRadioButton("Color Verde");
		this.rbAzul=new JRadioButton("Color Azul");
		ButtonGroup bg=new ButtonGroup();
		bg.add(this.rbRojo);
		bg.add(this.rbVerde);
		bg.add(this.rbAzul);
		
		this.btnColor=new JButton("Cambiar color");
		this.btnColor.addActionListener(new ActionListener(){
			Color tmpColor;
			public void actionPerformed(ActionEvent evt) {
				if(rbRojo.isSelected()) {
					tmpColor=Color.RED;
				} else if (rbVerde.isSelected()) {
					tmpColor=Color.GREEN;
				} else {
					tmpColor=Color.BLUE;
				}
			setBackground(tmpColor);
			rbVerde.setBackground(tmpColor);
			rbRojo.setBackground(tmpColor);
			rbAzul.setBackground(tmpColor);
			slider.setBackground(tmpColor);
			}	
		});
		
		this.add(this.tfNombre);
		this.add(this.btnNombre);
		this.add(this.rbRojo);
		this.add(this.rbVerde);
		this.add(this.rbAzul);
		this.add(this.btnColor);
		
		this.panelColor=new JPanel();
		this.panelColor.setPreferredSize(new Dimension(70,70));
		this.panelColor.setBackground(Color.RED);
		this.panelColor.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Color colorTmp=JColorChooser.showDialog(pd,"Escoge el color del globo del Vamoosh", panelColor.getBackground());
				panelColor.setBackground(colorTmp);
				pd.setColorGlobo(colorTmp);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		this.add(panelColor);
		
		
		this.slider=new JSlider(JSlider.VERTICAL,0,200,0);
		this.slider.setMinorTickSpacing(10);
		this.slider.setMajorTickSpacing(50);
		this.slider.setPaintTicks(true);
		this.slider.setPaintLabels(true);
		this.add(slider);
		this.slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pd.setYv(-slider.getValue());
			}
		});
		
		this.btnAbrir=new JButton("Abrir Archivo");
		this.btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				int respArchivo=fc.showOpenDialog(pd);
				if (respArchivo==JFileChooser.APPROVE_OPTION) {
					File archivo=fc.getSelectedFile();
					try {
						BufferedReader br = new BufferedReader(new FileReader(archivo.getAbsolutePath()));
						tfNombre.setText(br.readLine());
						int colorNum = Integer.parseInt(br.readLine());
						setBackground(new Color(colorNum));
						rbVerde.setBackground(new Color(colorNum));
						rbRojo.setBackground(new Color(colorNum));
						rbAzul.setBackground(new Color(colorNum));
						slider.setBackground(new Color(colorNum));
						br.close();
					}catch(IOException ex) {
						System.out.println("Error: "+ex);	
					}
				}
			}
		});
		this.add(this.btnAbrir);
		this.btnGuardar=new JButton("Guardar Archivo");
		this.btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				int respArchivo=fc.showSaveDialog(pd);
				if (respArchivo==JFileChooser.APPROVE_OPTION) {
					File
					archivo=fc.getSelectedFile();
					try {
						PrintWriter pw = new PrintWriter(archivo.getAbsolutePath());
						pw.println(tfNombre.getText());
						pw.println(getBackground().getRGB());
						pw.close();
					}catch(IOException ex) {
						System.out.println("Error: "+ex);	
						tfNombre.setText("Pocoyo");
					}
				
				}	
			}
		});
		this.add(btnGuardar);
		}
}
