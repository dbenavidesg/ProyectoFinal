package modelo;

public class Matriz {

	private int largo;
	private int ancho;
	private int matriz[][];

	public Matriz(int l, int a) {
		largo = l;
		ancho = a;
		matriz = new int[largo][ancho];
	}

	public void inicializar() {
		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				matriz[i][j] = 0;
			}
		}
	}

	public void capturarValor(int posL, int posA, int valor) {
		matriz[posL][posA] = valor;
	}

	public int retornarValor(int posL, int posA) {
		return matriz[posL][posA];
	}

	public String verMatriz() {
		String r = "";
		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				r = r + matriz[i][j] + "  ";
			}

		}
		return r;
	}

	//Getters y Setters
	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	

}
