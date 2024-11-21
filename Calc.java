package calculadora;

public class Calc {

	double x;
	double y;

	Calc(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public double Soma(double x, double y) {
		return x + y;
	}

	public double Sub(double x, double y) {
		return x - y;
	}

	public double Mult(double x, double y) {
		return x * y;
	}

	public double Div(double x, double y) {
		return x / y;
	}

}
