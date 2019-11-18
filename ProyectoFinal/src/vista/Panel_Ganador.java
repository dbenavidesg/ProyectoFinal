package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Ganador extends JPanel{

	public JLabel ganaste;
	public JButton boton_historial;
	public JButton boton_again;
	public JLabel imagen_confeti;
	
	public Panel_Ganador() {
		
		setLayout(null);
		setBackground(Color.white);
		inicializar();
		setVisible(true);
	}

	public void inicializar() {
		
		ganaste = new JLabel();
		ganaste.setText("¡GANASTE!");
		ganaste.setBounds(125, 25, 390, 100);
		ganaste.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 60));
		ganaste.setForeground(Color.white);
		add(ganaste);
		
		boton_historial = new JButton("Historial de juego");
		boton_historial.setBounds(45, 120, 185, 20);
		boton_historial.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 16));
		boton_historial.setBackground(Color.white);
		add(boton_historial);
		
		boton_again = new JButton("Volver a Jugar");
		boton_again.setBounds(245, 120, 185, 20);
		boton_again.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 16));
		boton_again.setBackground(Color.white);
		add(boton_again);
		
		imagen_confeti = new JLabel();
		imagen_confeti.setBounds(0, 0, 500, 250);
		add(imagen_confeti);
		
		
	}
		
	}

