package lacosRepeticao.repeticaoWhile;

import java.util.Scanner;

public class ExemploDoisWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Criando o Scanner para entrada do usuário
        Scanner leia = new Scanner(System.in);
        int opcao = 0;

        // Enquanto opcao for diferente de 9, o loop continuará
        while (opcao != 9) {
            System.out.println("Digite qualquer número para continuar ou\n9 para sair");

            // Corrigindo o erro na leitura da entrada do usuário
            opcao = leia.nextInt();
            System.out.println("Opção digitada = " + opcao);
            System.out.println("==================");
        }

        // Fechando o Scanner para evitar vazamento de recursos
		
		System.out.println("Obrigada por usar nosso app super legal!");
		
		
	}

}
