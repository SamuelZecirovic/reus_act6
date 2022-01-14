package reus_act6;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ej8 {

	public static double array[]= new double[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RellenarArray();
		MostrarArray();
	}

	public static void RellenarArray() {
	
		for (int i = 0; i < array.length; i++) {
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("introduce un numero"));
			array[i] = n1;
		}
	}
	
	public static void MostrarArray() {
		
		for (int i = 0; i < array.length; i++) {
		
			System.out.println(array[i]);
			
		}
	}
	
}
