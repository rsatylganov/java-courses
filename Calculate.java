public class Calculate {
	public static void main(String args[]) {
		System.out.println("Calculate ... ");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int sum = first + second;
		System.out.println("sum = " + sum);
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double dec(double a, double b) {
		return a - b;
	}

	public double mul(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		return a / b;
	}

	public double pow(double a, double b) {
		return Math.pow(a, b);
	}

}