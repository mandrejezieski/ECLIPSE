package exercicio001;

import java.util.Scanner;

public class exercicio001{
	 public static boolean cont;
	 public static int idade;
	 public static String nome;

	public static void main(String[] args) {
	        try (Scanner scan = new Scanner(System.in)) {

				while(cont = true) {
				    System.out.println("Nome: ");
				    nome = scan.next();

				    System.out.println("Idade: ");
				    idade = scan.nextInt();
				    
				    System.out.println("Quer continuar? ");
				    System.out.println("Digite false para finalizar.");
				    cont = scan.hasNext();
				}
			}
	        
	        System.out.println("Continua aqui...");

	    }
}
