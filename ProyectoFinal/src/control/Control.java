package control;

import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.Matriz;
import vista.VentanaMatriz;
import vista.Ventana_Bienvenida;
import vista.Ventana_Determinar_Tam;
import vista.Ventana_Ganador;
import vista.Ventana_Jugador;

public class Control implements ActionListener {

	// Modelo
	private Matriz modelo_matriz;

	// Vista --> Ventanas
	private Ventana_Determinar_Tam vnt_tam;
	private Ventana_Bienvenida vnt_bienvenida;
	private Ventana_Ganador vnt_ganador;
	private Ventana_Jugador vnt_jugador;
	private VentanaMatriz vnt_matriz;

	// Imagenes Ventana Bienvenida
	private ImageIcon imagenS;
	private Icon iconoS;
	private ImageIcon imagenE;
	private Icon iconoE;

	// Imagen Ventana Ganador
	private ImageIcon imagenG;
	private Icon iconoG;

	// Imagen Ventana Jugador
	private ImageIcon imagenJ1;
	private Icon iconoJ1;

	private ImageIcon imagenJ2;
	private Icon iconoJ2;

	private ImageIcon imagenJ3;
	private Icon iconoJ3;

	private ImageIcon imagenJ4;
	private Icon iconoJ4;

	public Control() {

		vnt_bienvenida = new Ventana_Bienvenida();

		// Agregar las imagenes de la ventana de bienvenida
		imagenE = new ImageIcon(getClass().getResource("/imagenes/Mantequilla.gif"));
		iconoE = new ImageIcon(imagenE.getImage().getScaledInstance(75, 125, Image.SCALE_DEFAULT));
		vnt_bienvenida.pnl_bienvenida.imagen_escalera.setIcon(iconoE);

		imagenS = new ImageIcon(getClass().getResource("/imagenes/serpiente.gif"));
		iconoS = new ImageIcon(imagenS.getImage().getScaledInstance(80, 125, Image.SCALE_DEFAULT));
		vnt_bienvenida.pnl_bienvenida.imagen_serpiente.setIcon(iconoS);

		// Darle una accion al boton de la ventana de bienvenida
		vnt_bienvenida.pnl_bienvenida.boton_jugar.addActionListener(this);

	}

	public void establecerTamMatriz() {

		String aux = vnt_tam.pnl_tam.campo_texto_filas.getText();
		int valor_filas = Integer.parseInt(aux);
		vnt_matriz.columnas = valor_filas;
		
		aux = vnt_tam.pnl_tam.campo_texto_columnas.getText();
		int valor_columnas = Integer.parseInt(aux);		
		modelo_matriz.setAncho(valor_columnas);
		
		
		JOptionPane.showMessageDialog(null, valor_filas);
		JOptionPane.showMessageDialog(null, valor_columnas);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Jugar")) {

			vnt_tam = new Ventana_Determinar_Tam();
			vnt_bienvenida.setVisible(false);

			vnt_tam.pnl_tam.boton_validar.addActionListener(this);

		}

		if (e.getActionCommand().equals("Crear")) {

			vnt_jugador = new Ventana_Jugador();
			vnt_tam.setVisible(false);

			// vnt_matriz.columnas =
			// Integer.parseInt(vnt_tam.pnl_tam.campo_texto_filas.getText());
			// vnt_matriz.filas =
			// Integer.parseInt(vnt_tam.pnl_tam.campo_texto_filas.getText());

			imagenJ1 = new ImageIcon(getClass().getResource("/imagenes/Puffle1.jpeg"));
			iconoJ1 = new ImageIcon(imagenJ1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
			vnt_jugador.boton1.setIcon(iconoJ1);
			vnt_jugador.boton1.addActionListener(this);

			imagenJ2 = new ImageIcon(getClass().getResource("/imagenes/Puffle2.png"));
			iconoJ2 = new ImageIcon(imagenJ2.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
			vnt_jugador.boton2.setIcon(iconoJ2);
			vnt_jugador.boton2.addActionListener(this);

			imagenJ3 = new ImageIcon(getClass().getResource("/imagenes/Puffle3.png"));
			iconoJ3 = new ImageIcon(imagenJ3.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
			vnt_jugador.boton3.setIcon(iconoJ3);
			vnt_jugador.boton3.addActionListener(this);

			imagenJ4 = new ImageIcon(getClass().getResource("/imagenes/Puffle4.png"));
			iconoJ4 = new ImageIcon(imagenJ4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
			vnt_jugador.boton4.setIcon(iconoJ4);
			vnt_jugador.boton4.addActionListener(this);
			
			establecerTamMatriz();
			
		}
		if (e.getActionCommand().equals("Boton1")) {
			vnt_ganador = new Ventana_Ganador();
			vnt_jugador.setVisible(false);
		}
		if (e.getActionCommand().equals("Boton2")) {
			vnt_ganador = new Ventana_Ganador();
			vnt_jugador.setVisible(false);

		}
		if (e.getActionCommand().equals("Boton3")) {
			vnt_ganador = new Ventana_Ganador();
			vnt_jugador.setVisible(false);
		}
		if (e.getActionCommand().equals("Boton4")) {
			vnt_ganador = new Ventana_Ganador();
			vnt_jugador.setVisible(false);
		}

	}
// Ventana Ganador y Agregar la imagen de fondo
// vnt_ganador = new Ventana_Ganador();
// imagenG = new ImageIcon(getClass().getResource("/imagenes/confeti.gif"));
// iconoG = new ImageIcon(imagenG.getImage().getScaledInstance(500, 250,
// Image.SCALE_DEFAULT));
// vnt_ganador.panel_ganador.imagen_confeti.setIcon(iconoG);

}
