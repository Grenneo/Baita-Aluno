/**
 * 
 */
package cursoJava;

import java.util.Scanner;

/**
 * @author Raphael
 */
public class UsuarioEscolheOperação {
	//Variaveis
	int n1, n2, operação;
	
	
	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero: ");
			int n1 = usuario.nextInt();
		System.out.println("Digite o segundo numero: ");
			int n2 = usuario.nextInt();
		System.out.println("Os numeros inseridos foram "+n1+ " e "+n2);
		System.out.println("Qual operação deseja realizar: [1] para 'soma', [2] para 'subtração', [3] para 'multiplicação ou [4] para divisão? ");
			int operação = usuario.nextInt();
		switch(operação) {
			case 1:
				operação=n1+n2;
			break;
				case 2:
					operação=n1-n2;
				break;
					case 3:
						operação=n1*n2;
					break;
						case 4:
							operação=n1/n2;
						break;
			default:
				System.out.println("Operação invalida");
		}
		System.out.println("Resultado da operação escolhida = "+operação);
		
		usuario.close();
		
	}

}
