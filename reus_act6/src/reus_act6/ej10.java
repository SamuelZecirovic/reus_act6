package reus_act6;

import javax.swing.JOptionPane;
import java.util.Random; // Esto importa la Clase random de java.util

public class ej10 {
	
	/*publicclassMathClassRandom{
	    Random claseRandom = new Random(); // Esto crea una instancia de la Clase Random
	    claseRandom.nextInt(7); // Genera un número entre 0 y 7, sin decimales raros ni nada
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("tamaño de array"));
		int array[]= new int[n1];	
		RellenarArray(array);
		MostrarArray(array);
		SumarArray(array);
		System.out.println(MasGrande(array));
		
	}


	public static void RellenarArray(int array[]) {
		
		int max = Integer.parseInt(JOptionPane.showInputDialog("rango maximo"));
	    Random claseRandom = new Random(); // Esto crea una instancia de la Clase Random

	
		for (int i = 0; i < array.length; i++) {
			int n1 = claseRandom.nextInt(max);
			if(Primo(n1)==true) {
				array[i] = n1;
			}else {
				i--;
			}
		}
	}
	
	public static boolean Primo(int n1) {

            int contador = 2;
            boolean resultado = true;
            while ((resultado) && (contador != n1)) {
                if (n1 % contador == 0)
                    resultado = false;
                contador++;
            }
            return resultado;

	}
	
	public static void MostrarArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
		
			System.out.println(array[i]);
			
		}
	}
	
	public static void SumarArray(int array[]) {
		
		double resultado = 0; 
		
		for (int i = 0; i < array.length; i++) {
		
			resultado = resultado + array[i];
			
		}
		
		System.out.println(resultado);
		
	}
	
	public static int MasGrande(int array[]) {

		int mayor=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>mayor){
                mayor=(int) array[i];
            }
        }

        return mayor;
		
	}
	
}
