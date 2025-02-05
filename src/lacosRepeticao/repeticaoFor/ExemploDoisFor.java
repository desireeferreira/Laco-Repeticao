package lacosRepeticao.repeticaoFor;

import java.util.Scanner;

public class ExemploDoisFor {

	public static void main(String[] args) {
		/*
		 * tabuada 
		 * 7 x 1 = 7
		 * 7 x 2 = 14
		 * 7 x 10 = 70
		 */
		//estrutura da tabuada
		for(int i = 1; i < 11; i++) {
			System.out.println("7 X "+i +" = "+(i*7) );
		}
		
		//teste for dentro de for
		for(int contador1 = 0; contador1 < 5; contador1 ++) {
			System.out.println("******Contador 1 é: "+ contador1+"******");
			for(int contador2 = 5; contador2 >0; contador2--) {
				System.out.println("Contador 2 é: "+ contador2);
			}
		}
		
	}
}