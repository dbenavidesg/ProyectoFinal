package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Tam extends JPanel {

	public JLabel etiqueta_filas;
	public JLabel etiqueta_columnas;
	public JTextField campo_texto_filas;
	public JTextField campo_texto_columnas;
	public JButton boton_validar;

	public Panel_Tam() {

		setLayout(null);
		setBackground(Color.white);
		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {

		etiqueta_filas = new JLabel("Filas");
		etiqueta_filas.setBounds(50, 5, 85, 15);
		etiqueta_filas.setForeground(Color.pink);
		etiqueta_filas.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 16));
		add(etiqueta_filas);
		
		etiqueta_columnas = new JLabel("Columnas");
		etiqueta_columnas.setBounds(50, 60, 85, 15);
		etiqueta_columnas.setForeground(Color.pink);
		etiqueta_columnas.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 16));
		add(etiqueta_columnas);
		
		campo_texto_filas = new JTextField();
		campo_texto_filas.setBounds(50, 20, 175, 20);
		add(campo_texto_filas);
		
		campo_texto_columnas = new JTextField();
		campo_texto_columnas.setBounds(50, 75, 175, 20);
		add(campo_texto_columnas);
		
		boton_validar = new JButton("Crear");
		boton_validar.setBounds(290, 40, 190, 20);
		boton_validar.setForeground(Color.black);
		boton_validar.setBackground(Color.orange);
		boton_validar.setFont(new Font("Bernard MT Condensed", Font.TRUETYPE_FONT, 16));
		add(boton_validar);
		
	}

}
