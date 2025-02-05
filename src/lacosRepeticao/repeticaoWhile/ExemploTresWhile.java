package lacosRepeticao.repeticaoWhile;

import java.util.Scanner;

public class ExemploTresWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//uso do while = opcao = sair 
		Scanner leia = new Scanner(System.in);
				String opcao = "";
				
				//opcao == "sair" => opcao.equals("sair)
				//opcao != "sair" => !opcao.equals("sair")
				
		while(!opcao.equals("sair")) {
			System.out.println("Digite SAIR para sair ou qualquer " + "coisa para continuar");
			opcao = leia.nextLine();
			System.out.println("Estamos dentro while,  \nVocê digitou:" + opcao);
			System.out.println("-----------------");
			}
		System.out.println("Programa terminado!");
	}

}
