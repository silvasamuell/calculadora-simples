package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual operação deseja realizar?");
		System.out.println("1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
		int resposta = entrada.nextInt();

		System.out.println("Qual é o primeiro número?");
		double x = entrada.nextDouble();

		System.out.println("Qual é o segundo número?");
		double y = entrada.nextDouble();

		double resultado;

		switch (resposta) {
		case 1:
			System.out.println(resultado = new Calc(x, y).Soma(x, y));
			break;
		case 2:
			System.out.println(resultado = new Calc(x, y).Sub(x, y));
			break;
		case 3:
			System.out.println(resultado = new Calc(x, y).Mult(x, y));
			break;
		case 4:
			System.out.println(resultado = new Calc(x, y).Div(x, y));
			break;
		default:
			System.out.println("Esse operação não é válida");
			break;
		}

		entrada.close();

	}

}
