public class Calculator {
	public static void main(String args[]) {
		System.out.println("Calculator ... ");
		Calculator c = new Calculator();
		c.add(1, 2, 3); 
		System.out.println("result = " + c.getResult());
		c.show(1, 2, 3, 4);
		
	}
	private int result;

	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	public void show(int ... params) {
		for (Integer param : params) {
			System.out.println(param);
		}
	}

	
	public int getResult() {
		return this.result;
	}

	public void clearResult() {
		this.result = 0;
	}

}