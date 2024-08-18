/*7. Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro. Por
exemplo, se a entrada for 123, portanto 1+2+3, logo, a saída deverá ser 6.*/
package controller;

public class ControllerDigitos {
	
	public ControllerDigitos() {
		super();
	}
	
	public int somaDigitos(int numero) {
		int soma = 0;
		if(numero == 0) {
			return 0;//Quando o numero chegar a 0, retorna 0 para a soma.
		} else {
			soma += numero % 10;
			return soma + somaDigitos(numero / 10);//Senão, soma recebe o ultimo digito pelo resto da divisao por 10 e retorna soma mais recursiva, dividindo numero por 10.
		}
	}
}
