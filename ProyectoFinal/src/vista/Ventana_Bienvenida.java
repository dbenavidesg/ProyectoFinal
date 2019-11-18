package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Bienvenida extends JFrame {

	public Panel_Bienvenida pnl_bienvenida;
	
	public Ventana_Bienvenida() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 250);
		setResizable(false);
		setBackground(Color.white);
		inicializarComponentes();
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		pnl_bienvenida = new Panel_Bienvenida();
		pnl_bienvenida.setBounds(0, 0, 490, 230);
		add(pnl_bienvenida);
		
	}
}
