package reus_act6;

import javax.swing.JOptionPane;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        System.out.println(DecimalABinario(numero));
		
	}
	
	public static String DecimalABinario(int numero) {
		
		String binario="";
		String digito;
		for(int i=numero;i>0;i/=2){
			if(i%2==1){
				digito="1";
		    }else{
		    digito="0";
		    }
			binario=digito+binario;
		}
		return binario;
	}	

}
