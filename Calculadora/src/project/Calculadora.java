package project;

import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Calculadora {

	public static double Multiplicacao(double X, double Y) {

		return X * Y;
	}

	public static double Divisao(double X, double Y) {

		return X / Y;
	}
	
	public static double Resto(double X, double Y) {
		return 	X % Y;
	}

	public static double Adicao(double X, double Y) {

		return X + Y;
	}

	public static double Subtracao(double X, double Y) {

		return X - Y;
	}

	public static double Potenciacao(double X, double Y) {

		return Math.pow(X, Y);
	}
	
	public static double lerDouble(Scanner SC) {
		return  Double.parseDouble(SC.nextLine());
	}
	
	public static int lerInt(Scanner SC) {
		return  Integer.parseInt(SC.nextLine());
	}
	

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		boolean Repetir = true;

		while (Repetir) {
			System.out.println(
					"Seja bem vindo e faça um bom uso  \n" );

			System.out.println(
					"Para darmos inicio, por favor escolha a operação:");

			System.out.println(
					"-------- 1°) Adição ");
			System.out.println(
					"-------- 2°) Subtração ");
			System.out.println(
					"-------- 3°) Multiplicação ");
			System.out.println(
					"-------- 4°) Divisão ");
			System.out.println(
					"-------- 5°) Resto da divisão ");
			System.out.println(
					"-------- 6°) Potenciação ");
    
			int OP = lerInt(SC);
			
			System.out.println("Digite o 1 valor:..");
			double X = lerDouble(SC);

			System.out.println("Digite o 2 valor:..");
			double Y = lerDouble(SC);
    

			switch (OP) {

			case 1:
				System.out.println("O Resultado é:  " + Adicao(X, Y));
				break;

			case 2:
				System.out.println("O Resultado é:  " + Subtracao(X, Y));
				break;

			case 3:
				System.out.println("O Resultado é:  " + Multiplicacao(X, Y));
				break;

			case 4:
				System.out.println("O Resultado é:  " + Divisao(X, Y));
				break;

			case 5:
				System.out.println("O resto da divisão é:  " + Resto(X,Y));
				break;

				
			case 6:
				System.out.println("O Resultado é:  " + Potenciacao(X, Y));
				break;

			
			default:
				System.out.println("Operação Invalida");
			}
			while(true) {
				
				System.out.println("Deseja fazer mais alguma operação? (s/n)");
				String captcha = SC.nextLine();

				if (List.of("s", "S", "n", "N").contains(captcha)) {
					Repetir = List.of("s", "S").contains(captcha);
					break;
				} else {
					System.out.println("Opção inválida");
				
				}
				
			}

		}
		System.out.println("Tchau :D");
		SC.close();

	}
}
