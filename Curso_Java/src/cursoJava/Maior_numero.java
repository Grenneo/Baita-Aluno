/**
 * 
 */
package cursoJava;
import java.util.Scanner;

/**
 * @author Raphael
 * Aula para maior numero
 */

public class Maior_numero {

	//Declarando variaveis
	int n1, n2, r;
	
	
	public static void main(String[] args) {
	Scanner texto = new Scanner(System.in);
		System.out.println("Agora vai!");
	
	//Inicio da interecao com o usuario
		System.out.println("Digite o primeiro numero: ");
			int n1 = texto.nextInt();
		System.out.println("Digite o segundo numero: ");
			int n2 = texto.nextInt();
		System.out.println("Os numeros digitados foram " + n1 + " e " + n2);
			int r = (n1>n2)?n1:n2;
		System.out.println("O maior numero é "+ r);
	texto.close();
	}

}
