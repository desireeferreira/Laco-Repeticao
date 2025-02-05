package lacosRepeticao.repeticaoWhile;

import java.util.Scanner;

public class ExemploDoisWhile {

	public static void main(String[] args) {
		// quando o usuario vai definir quando parar a repetição
		
				Scanner leia = new Scanner(System.in);
				int opcao=0;
				
				
				//enquanto opção que ser entrada do usuario for diferente 9 repetir bloco
				while(opcao != 9) {
					System.out.println("Digite qualquer numero para continuar ou"
							+ "\n 9 para sair");
					opcao = leia.nextInt();
					System.out.println("Opção digitada = " + opcao);
					System.out.println("================================");
					
				}
				System.out.println("Obrigada por usar nosso app super legal!");
				
			}
		}
