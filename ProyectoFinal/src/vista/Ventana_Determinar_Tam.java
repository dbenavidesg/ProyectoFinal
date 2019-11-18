package vista;

import javax.swing.JFrame;

public class Ventana_Determinar_Tam extends JFrame {

	public Panel_Tam pnl_tam;
	public Panel_Tam_Instrucciones pnl_instrucciones;
	
	public Ventana_Determinar_Tam() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 450);
		setTitle("Determinar Tamaño del Tablero");
		setResizable(false);
		inicializarComponentes();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		pnl_tam = new Panel_Tam();
		pnl_tam.setBounds(25, 20, 535, 120);
		add(pnl_tam);
		
		pnl_instrucciones = new Panel_Tam_Instrucciones();
		pnl_instrucciones.setBounds(25, 160, 535, 225);
		add(pnl_instrucciones);
	}
	
}
