package reus_act6;

import java.util.Random;

import javax.swing.JOptionPane;

public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("tamaño de array"));
		String numfinal = JOptionPane.showInputDialog("diga en que numero quiere que acabe");
		int array[]= new int[n1];	
		RellenarArray(array);
		MostrarFinal(array,numfinal );
	}


	public static void RellenarArray(int array[]) {
		
	    Random claseRandom = new Random(); // Esto crea una instancia de la Clase Random
	
		for (int i = 0; i < array.length; i++) {
			int n1 = claseRandom.nextInt(300);

		}
	}

	public static void MostrarFinal(int array[], String numfinal) {
		String num;
		for (int i = 0; i < array.length; i++) {
	    	num = Integer.toString(array[i]);
	    	if (num.contains(numfinal)) {
	        	System.out.println("Esta es la eleccion "+array[i]);
	        }
	    }
	}
}

