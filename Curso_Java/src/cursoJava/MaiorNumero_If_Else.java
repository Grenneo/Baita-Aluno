/**
 * 
 */
package cursoJava;

import java.util.Scanner;

/**
 * @author Raphael
 */
public class MaiorNumero_If_Else {

	public static void main(String[] args) {
		//Declarando variaveis
        int valorA;
        int valorB;
        int maiorValor;
        int resS;
        int resSub;
        int resMult;
        int resDiv;
        
        //Chamando a classe Scanner
        Scanner usuario = new Scanner(System.in);
        
        //Início da interação com o usuário
        
        System.out.println("Digite o primeiro valor: ");
        valorA = usuario.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        valorB = usuario.nextInt();
        
        //Saída da informação
        System.out.println("Você digitou " + valorA + " e " + valorB);
        
        resS = valorA + valorB;
        resSub = valorA - valorB;
        resMult = valorA * valorB;
        resDiv = valorA / valorB;
        
        System.out.println("Soma = " + resS);
        System.out.println("Subtração = " + resSub);
        System.out.println("Multiplicação = " + resMult);
        System.out.println("Divisão = " + resDiv);
        
        //Comparação para saber qual operação tem o maior valor
        if(resS > resSub){
            maiorValor = resS;
        } else {
            maiorValor = resSub;
        }
        if(resSub > resMult){
            maiorValor = resSub;
        } else {
            maiorValor = resMult;
        }
        if(resMult > resDiv){
            maiorValor = resMult;
        } else {
            maiorValor = resDiv;
        }
        
        System.out.println("O maior valor é: " + maiorValor);

	}

}
