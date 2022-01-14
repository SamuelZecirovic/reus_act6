package reus_act6;

import javax.swing.JOptionPane;

public class ej1 {

	final public static double pi = Math.PI;
	public static double resultado = 0;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleccionCalculo();

	}
	
	public static void SeleccionCalculo() {
		String dia = JOptionPane.showInputDialog("introduce que desea calcular (circulo / triangulo / cuadrado)");

		switch (dia) {
			case "circulo":
				resultado = CalcularCirculos();
				System.out.println(resultado);
				
			break;
			
			case "triangulo":
				resultado = CalcularTriangulos();
				System.out.println(resultado);

			break;
			
			case "cuadrado":
				resultado = CalcularCuadrados();
				System.out.println(resultado);

			break;
	
			default:
				System.out.println("el calculo introducido no existe");
				break;
		}

	}
	
	
	public static double CalcularCirculos() {
		double radio, resultado;
		radio= Double.parseDouble(JOptionPane.showInputDialog("introduce el radio"));

		
		resultado = pi*Math.pow(radio, 2);
		
		return resultado;
	}
	
	public static double CalcularTriangulos() {
		double base, altura, resultado;
		base= Double.parseDouble(JOptionPane.showInputDialog("introduce la base"));
		altura= Double.parseDouble(JOptionPane.showInputDialog("introduce la altura"));

		resultado = (base * altura) / 2;
		
		return resultado;
	}
	
	public static double CalcularCuadrados() {
		double lado, resultado;
		lado= Double.parseDouble(JOptionPane.showInputDialog("introduce el lado"));

		resultado = lado * lado;
		
		return resultado;
	}
	

}
