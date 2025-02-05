package AtividadePratica;

import java.util.Scanner;
public class atividadefordois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner leia =  new Scanner(System.in);
		
		int pares = 0;
		int impares =0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			int numero = leia.nextInt();
			
			if( numero % 2 == 0){
				pares++;}				
			else {
				impares++;
				}
			}
			System.out.println("Total de números pares: " +pares);
			System.out.println("Total de números impares: " + impares);
			
			leia.close();
	}
	}
	


