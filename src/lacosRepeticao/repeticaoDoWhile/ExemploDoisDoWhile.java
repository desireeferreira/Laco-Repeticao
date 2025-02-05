package lacosRepeticao.repeticaoDoWhile;

import java.util.Scanner;

public class ExemploDoisDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// objetivo = ter a saída de um menu pelo menos 1 vez para o usuário
				//até a pessoa digitar 9
				Scanner leia = new Scanner(System.in);
				
				int contador = 9;
				
				do {
					System.out.println("Digite qualquer numero para continuar"
							+ "\nDigite 9 para sair");
					contador = leia.nextInt();
					System.out.println("Você digitou o numero: " + contador);
					
				}while(contador != 9);
				
				System.out.println("-----Saimos do loop!-----");
				
			}
		}