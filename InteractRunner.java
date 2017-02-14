import java.util.Scanner;

public class InteractRunner {
	public static void main(String args[]) {
		System.out.println("InteractRunner ... ");
		Scanner reader = new Scanner(System.in);	
		try {
			Calculator cal = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first argument: ");
				String first = reader.next();
				System.out.println("Enter second argument: ");
				String second = reader.next();
				cal.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Sum = " + cal.getResult());
				System.out.println("Exit? yes\no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
	
}