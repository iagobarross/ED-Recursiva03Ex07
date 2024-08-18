package view;

import java.util.Scanner;

import controller.ControllerDigitos;

public class Principal {

	public static void main(String[] args) {
		ControllerDigitos contDigito = new ControllerDigitos();
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int soma = contDigito.somaDigitos(numero);
		
		System.out.println(soma);
		sc.close();
	}

}
