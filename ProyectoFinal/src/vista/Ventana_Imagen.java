package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Imagen extends JFrame{

	public Ventana_Imagen() {
		
		getContentPane().setLayout(null);
		setSize(600, 450);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
		
		inicializarComponentes();

		setLocationRelativeTo(null);
		setVisible(true);

	}
	public void inicializarComponentes() {
		
		
	}
}

