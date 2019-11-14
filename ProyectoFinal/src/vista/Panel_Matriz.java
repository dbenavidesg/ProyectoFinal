package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Matriz extends JPanel {

	public int columnas;
	public int filas;
	public JButton tablero[][];
	
	public Panel_Matriz() {
		
		setLayout(new GridLayout());
		cargarTablero();
		
		setVisible(true);
	}

	public void cargarTablero() {

		// inicializar la matriz
		tablero = new JButton[filas][columnas];

		// Cargar cada boton --> distanciando cada boton
		//Para que el tamaño cree boton por boton dependiendo del tamaño seleccionado por el usuario
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tablero[i][j] = new JButton();
				add(tablero[i][j]);
			}
		}
		validate();
		repaint();
	}

}
