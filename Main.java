package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual operação deseja realizar?");
		System.out.println("1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
		int resposta = entrada.nextInt();

		Calc calc = new Calc();

		double resultado = 0;

		if (resposta >= 1 && resposta <= 4) {

			System.out.println("Qual é o primeiro número?");
			double x = entrada.nextDouble();

			System.out.println("Qual é o segundo número?");
			double y = entrada.nextDouble();

			switch (resposta) {
			case 1:
				System.out.println(resultado = calc.Soma(x, y));
				break;
			case 2:
				System.out.println(resultado = calc.Sub(x, y));
				break;
			case 3:
				System.out.println(resultado = calc.Mult(x, y));
				break;
			case 4:
				System.out.println(resultado = calc.Div(x, y));
				break;
			}
		} else {
			System.out.println("Essa operação não é válida");
		}

		entrada.close();

	}

}
