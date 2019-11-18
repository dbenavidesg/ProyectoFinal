package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana_Ganador extends JFrame {

	public Panel_Ganador panel_ganador;
	
	public Ventana_Ganador() {
		
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
		
		panel_ganador = new Panel_Ganador();
		panel_ganador.setBounds(0, 0, 500, 250);
		add(panel_ganador);
		

	}
}
