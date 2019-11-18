package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana_Jugador extends JFrame {

	public JButton boton1;
	public JButton boton2;
	public JButton boton3;
	public JButton boton4;
	public JLabel titulo;
	public Icon icono;
	public ImageIcon imagen;

	public Ventana_Jugador() {

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

		titulo = new JLabel("Seleccione la cantidad de jugadores");
		titulo.setBounds(80, 0, 500, 50);
		titulo.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 30));
		titulo.setForeground(Color.BLACK);
		getContentPane().add(titulo);

		boton1 = new JButton("Boton1");
		boton1.setBounds(130, 70, 150, 150);
		boton1.setBackground(Color.white);
		boton1.setForeground(Color.white);
		getContentPane().add(boton1);

		boton2 = new JButton("Boton2");
		boton2.setBounds(130, 230, 150, 150);
		boton2.setBackground(Color.white);
		boton2.setForeground(Color.white);
		getContentPane().add(boton2);

		boton3 = new JButton("Boton3");
		boton3.setBounds(310, 70, 150, 150);
		boton3.setBackground(Color.white);
		boton3.setForeground(Color.white);
		getContentPane().add(boton3);

		boton4 = new JButton("Boton4");
		boton4.setBounds(310, 230, 150, 150);
		boton4.setBackground(Color.white);
		boton4.setForeground(Color.white);
		getContentPane().add(boton4);
	}
}
