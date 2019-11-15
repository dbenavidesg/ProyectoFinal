package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Panel_Tam_Instrucciones extends JPanel {

	public JTextArea area_instrucciones;
	public JScrollPane barraDesplazamiento;

	public Panel_Tam_Instrucciones() {

		setLayout(null);

		setBackground(Color.white);

		inicializarComponentes();

		TitledBorder border = new TitledBorder("Instrucciones");
		border.setTitleColor(Color.PINK);
		setBorder(border);

		setVisible(true);
	}

	public void inicializarComponentes() {

		area_instrucciones = new JTextArea(
				"1. El objetivo del juego es ser el primer jugador en llegar hasta el final moviéndote a " + "\r\n"
						+ "través del tablero desde el cuadro inicial al cuadro final." + "\r\n" + "\r\n"
						
						+ "2. Para avanzar por el tablera los jugadores deben de tirar el dado y moverse el número "
						+ "\r\n" + "de casillas que el dado muestre." + "\r\n" + "\r\n"
						
						+ "3. Las escaleras en el tablero te permiten subir para avanzar con más rapidez. Si caes "
						+ "\r\n"
						+ "en un cuadro que muestra la imagen del inicio de la escalera, entonces puedes mover "
						+ "\r\n"
						+ "tu pieza por toda la escalera hasta donde termina. Ten en cuenta que si caes en la parte"
						+ "\r\n"
						+ "superior de la escalera o en un cuadro a la mitad de la escalera, te tienes que quedar en "
						+ "\r\n" + "ese mismo lugar. No te puedes mover hacia abajo de la escalera." + "\r\n" + "\r\n"
						
						+ "4. Las serpientes hacen que te muevas hacia atrás en el tablero ya que te tienes que "
						+ "\r\n"
						+ "deslizar por ellas. Si caes exactamente en un cuadro donde está la cola de la serpiente "
						+ "\r\n"
						+ "(o el inicio del resbaladero), tienes que deslizar tu ficha hasta donde está la cabeza de "
						+ "\r\n"
						+ "la serpiente (o el final del resbaladero). Si caes en un cuadro en donde se encuentra a la "
						+ "\r\n"
						+ "mitad o al final de la serpiente, no pasa nada. Solo te tienes que deslizar por la serpiente"
						+ "\r\n" + " si caes exactamente en el cuadro de la cola." + "\r\n" + "\r\n"
						
						+ "5. Si al tirar el dado, cae un 6, entonces el jugador tiene un turno extra. Primero se"
						+ "\r\n"
						+ "mueven los 6 espacios hacia adelante y se vuelve a tirar el dado de nuevo. Si cae en"
						+ "\r\n"
						+ "una escalera o serpiente, sigue las instrucciones anteriores para avanzar y después "
						+ "\r\n" + "volver a tirar el dado. Si vuelve a caer un 6, se puede seguir avanzando." + "\r\n"
						+ "\r\n"
						
						+ "6. El primer jugador que llegue al último cuadro del tablero gana. Sin embargo, si el dado"
						+ "\r\n"
						+ "cae en un número muy alto, tu ficha salta al último cuadro y luego \"rebota\" hacia atrás. "
						+ "\r\n"
						+ "Solo puedes ganar si cae el número exacto que necesitas para caer en el último cuadro. "
						+ "\r\n"
						+ "Por ejemplo, si la última posición en 20 y el un jugador se encuentra en la posición 49 "
						+ "\r\n"
						+ "y sale un 4 en el dado, se mueve el jugador a la posición 50 y se devuelve las otras tres "
						+ "\r\n"
						+ "casillas restantes. Es decir, que el jugador termina en la casilla 47. Si el cuadro 47 es "
						+ "\r\n"
						+ "la base de una escalera o la cola de una serpiente, tienes que subir o bajar dependiendo "
						+ "\r\n" + "de qué te toca.");

		area_instrucciones.setBounds(5, 30, 495, 215);

		barraDesplazamiento = new JScrollPane();
		barraDesplazamiento.setBounds(490, 8, 43, 215);
		add(barraDesplazamiento);

		add(area_instrucciones);
	}

}
