package reus_act6;

import javax.swing.JOptionPane;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(SeleccionCalculo());

	}
	
	public static double SeleccionCalculo() {
		

		double resultado = 0, n1 = Double.parseDouble(JOptionPane.showInputDialog("cuantos euros desea cambiar"));
		String moneda = JOptionPane.showInputDialog("introduce a que moneda deseas cambiar (yenes,dolares, libras)");

		switch (moneda) {
			case "dolares":
				resultado = n1 * 1.28611;				
			break;
			
			case "yenes":
				resultado = n1 * 129.852;
			break;
			
			case "libras":
				resultado = n1 * 0.86;
			break;
	
			default:
				System.out.println("la moneda no existe");
				break;
		}
		
		return resultado;

	}
		
}

