import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Codes.*;


public class Gui extends JFrame implements ActionListener,WindowListener,KeyListener,Runnable {
	JTextField input;
	JButton button;
	JLabel text,icon;
	Thread t;
	Timer tmp;
	public  Gui(){
		super("Validador de Codigos de Ident.");
		
		setLayout(new GridBagLayout());
		setMinimumSize(new Dimension(200,100));
		GridBagConstraints c = new GridBagConstraints();
		
	input = new JTextField("Introduce un codigo valido");
	input.selectAll();
	input.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case 27:
				tmp.stop();
				input.setText("");
				break;
			default:
				tmp.stop();
			}
			
		}
	});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridheight=1;
		c.gridwidth=4;
	
	add(input,c);
	
	button = new JButton("Validar");
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
				Nif nif = new Nif(input.getText());
				Cif cif = new Cif(input.getText());
				Nie nie = new Nie(input.getText());
			
				if(nif.isNif()){
					icon.setText("Nif Correcto");
				}else if(cif.isCif()){
					icon.setText("Cif Correcto");
				}else if(nie.isNie()){
					icon.setText("Nie Correcto");
				} 
				else
					icon.setText("Incorrecto");
			
				tmp.start();
				input.requestFocus();
				input.selectAll();
//				t= new Thread(Gui.this);
//				t.start();
		}
	});
	
		
		c.fill = GridBagConstraints.CENTER;
		c.gridx=0;
		c.gridy=2;
		c.gridheight=1;
		c.gridwidth=2;
		
	add(button,c);
	
	
	
	icon = new JLabel("Esperando Code");
	c.fill = GridBagConstraints.CENTER;
		c.gridx=2;
		c.gridy=2;
		c.gridheight=1;
		c.gridwidth=2;
		
	add(icon,c);
	pack();
	tmp = new Timer(30000, this);
	
		
	}
	public static void main(String[] args){
		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tmp.stop();
		input.setText("");
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			input.setText("");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
