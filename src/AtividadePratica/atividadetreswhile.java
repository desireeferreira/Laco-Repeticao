package AtividadePratica;

import java.util.Scanner;

public class atividadetreswhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner (System.in);
        
        int  menoresDe21=0;
        int maioresDe50=0;
        
        System.out.println("Digite uma idade:");
        int idade = entrada.nextInt();
        
        while (idade>=0) {
        	if (idade <21) {
        		menoresDe21++;
        	}
        	else if(idade > 50) {
        		maioresDe50++;
        	}
        	
        	System.out.println("Digite uma idade");
        	idade= entrada.nextInt();
        	}
        System.out.println("Total de pessoas menores de 21 anos: " +menoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50);
        
        entrada.close();
	}
	
	

}
