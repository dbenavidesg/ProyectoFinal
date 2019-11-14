package vista;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ventana_Tam extends JFrame {

	public Panel_Tam pnl_tam;
	
	public Ventana_Tam() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 450);
		setResizable(false);
		inicializarComponentes();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		pnl_tam = new Panel_Tam();
		//pnl_tam.setBounds(x, y, width, height);
		add(pnl_tam);
	}
	
}
