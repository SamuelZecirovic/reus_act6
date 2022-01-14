package reus_act6;

import javax.swing.JOptionPane;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(NumeroCifras());
		
	}
	
	public static int NumeroCifras() {
		
		String n1 = JOptionPane.showInputDialog("introduce el numero");	

		int resultado = 0, num1 = Integer.parseInt(n1);
		
		if (num1<0) {
			System.out.println("ponga numeros positivos");
		}else {
			resultado = n1.length();
		}
		
		return resultado;
			
	}

}
