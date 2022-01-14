package reus_act6;

import javax.swing.JOptionPane;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(SosPrimo()==true) {
			System.out.println("es primo");
		}else {
			System.out.println("no es primo");
		}
		
	}
	
	public static boolean SosPrimo() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));

            int contador = 2;
            boolean resultado = true;
            while ((resultado) && (contador != n1)) {
                if (n1 % contador == 0)
                    resultado = false;
                contador++;
            }
            return resultado;

	}
}


