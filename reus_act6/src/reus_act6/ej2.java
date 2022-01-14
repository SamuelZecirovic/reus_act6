package reus_act6;

import javax.swing.JOptionPane;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NumAleatorios();
		
	}
	
	public static void NumAleatorios() {
		int cantidad, n1, n2;
		cantidad= Integer.parseInt(JOptionPane.showInputDialog("introduce cantidad"));

		n1 =Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango de numeros aleatorios, el mas pequeño"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango de numeros aleatorios, el mas grande"));
	    for(int i = 0; i < cantidad; i++) {
	    	System.out.println(generarNumero(n1, n2, cantidad));
	    }
	}
	
	public static int generarNumero(int n1, int n2, int cantidad) {

		return ((int)Math.floor(Math.random()*(n2-n1) + cantidad));
		
	}

}
