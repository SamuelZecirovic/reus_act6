package reus_act6;

import javax.swing.JOptionPane;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CalcularFactor());
		
	}
	
	public static double CalcularFactor() {
		
		double resultado = 1, n1 = Double.parseDouble(JOptionPane.showInputDialog("introduce un numero"));


		for (int i=2;i<=n1;i++)
			  resultado = resultado * i;
		
		return resultado;
		
	}

}
