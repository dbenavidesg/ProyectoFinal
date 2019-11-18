package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Panel_Bienvenida extends JPanel {
	
	public JButton boton_jugar;
	public JLabel etiqueta_titulo;
	public JLabel etiqueta_nombre_juego;
	public JLabel imagen_serpiente;
	public JLabel imagen_escalera;

	public Panel_Bienvenida() {

		setLayout(null);
		setBackground(Color.white);
		
		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
		
		etiqueta_titulo = new JLabel("BIENVENIDOS");		
		etiqueta_titulo.setBackground(Color.white);
		etiqueta_titulo.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 60));		
		etiqueta_titulo.setBounds(95, 5, 360, 100);
		add(etiqueta_titulo);
		
		etiqueta_nombre_juego = new JLabel("Snakes and Ladders");
		etiqueta_nombre_juego.setBackground(Color.white);
		etiqueta_nombre_juego.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 25));
		etiqueta_nombre_juego.setBounds(145, 110, 200, 20);
		add(etiqueta_nombre_juego);
		
		boton_jugar = new JButton("Jugar");
		boton_jugar.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 16));
		boton_jugar.setBounds(200, 155, 70, 30);
		add(boton_jugar);
		
		imagen_escalera = new JLabel();
		imagen_escalera.setBounds(10, 25, 85, 150);
		add(imagen_escalera);
		
		imagen_serpiente = new JLabel();
		imagen_serpiente.setBounds(395, 40, 80, 125);
		add(imagen_serpiente);
		
	}
}
