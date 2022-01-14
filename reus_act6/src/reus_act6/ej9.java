package reus_act6;

import javax.swing.JOptionPane;

public class ej9 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("tamaño de array"));
		double array[]= new double[n1];	
		RellenarArray(array);
		MostrarArray(array);
		SumarArray(array);
		
	}


	public static void RellenarArray(double array[]) {
	
		for (int i = 0; i < array.length; i++) {
			double n1 = ((int)Math.floor(Math.random()*(10-0)+0));
			array[i] = n1;
		}
	}
	
	public static void MostrarArray(double array[]) {
		
		for (int i = 0; i < array.length; i++) {
		
			System.out.println(array[i]);
			
		}
	}
	
	public static void SumarArray(double array[]) {
		
		double resultado = 0; 
		
		for (int i = 0; i < array.length; i++) {
		
			resultado = resultado + array[i];
			
		}
		
		System.out.println(resultado);
		
	}

}
