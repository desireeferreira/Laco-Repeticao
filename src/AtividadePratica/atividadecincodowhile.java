package AtividadePratica;

import java.util.Scanner;
public class atividadecincodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma= 0;
		int numero;
		Scanner leitor = new Scanner(System.in);
		
	do {
		System.out.print("Digite um número: ");
	     numero= leitor.nextInt();
	
	     if (numero >0) {
	    	 soma+=numero;
	     }
	     } while(numero != 0);
	
	System.out.print("Os numeros positivos é:"+ soma );
	
	leitor.close();
	}

}
