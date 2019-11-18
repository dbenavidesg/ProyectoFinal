package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class VentanaMatriz extends JFrame{

	
	public int columnas;
	public int filas;
	public JButton tablero[][];
	
	public Panel_Matriz pnl_matriz;
	
	public VentanaMatriz() {
		
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 750);
		setResizable(false);
		inicializarComponentes();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		pnl_matriz = new Panel_Matriz();
		pnl_matriz.setBounds(25, 25, 650, 700);
		add(pnl_matriz);
		
//		String [] columnas = {""};
		
//		JTable table = new JTable(tablero, columnas);
//		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//		Alinear.setHorizontalAlignment(SwingConstants.CENTER);
//		table.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//		JScrollPane scroll = new JScrollPane(table);
//		getContentPane().add(scroll);
		
	}
}
