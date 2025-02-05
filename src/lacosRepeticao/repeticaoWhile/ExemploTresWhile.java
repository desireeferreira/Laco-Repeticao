package lacosRepeticao.repeticaoWhile;

import java.util.Scanner;

public class ExemploTresWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// uso do while = opção = sair
				Scanner leia = new Scanner(System.in);
				String opcao = "";
				
				//opcao == "sair" => opcao.equals("sair")
				//opcao != "sair" => !opcao.equals("sair")
				while(!opcao.equals("sair")) {
					System.out.println("Digite SAIR para sair ou qualquer "
							+ "coisa p continuar");
					opcao = leia.nextLine();
					System.out.println("Estamos dentro do while, \nVocê digitou:" + opcao);
					System.out.println("-------------------------------------");
				}
				System.out.println("Programa terminado!!");
			}
		}