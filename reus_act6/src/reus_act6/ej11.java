package reus_act6;

import javax.swing.JOptionPane;

public class ej11 {

	public static void main(String[] args) {

        int lista = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor m�ximo del array"));

        int array1[] = new int [lista];
        int array2[];

        rellenarAleatoriosArray(array1, 10, 100);

        array2 = array1;
        array1 = new int [lista];

        rellenarAleatoriosArray(array1, 10, 100);

        int array3[] = multiplicacion(array1, array2);

        System.out.println("Array1");
        mostrarArray(array1);
        System.out.println("Array2");
        mostrarArray(array2);
        System.out.println("Array3");
        mostrarArray(array3);
    }

    public static void rellenarAleatoriosArray(int array[], int a, int b) {
        for(int i = 0; i < array.length; i++) {
        	array[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    public static void mostrarArray(int array[]) {
    	System.out.println("----------------------------------------");
    	for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] multiplicacion(int array1[], int array2[]) {
        int array3[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i]*array2[i];
        }
        return array3;
    }
}


