import java.util.Scanner;
public class BasicMathOperations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		int x = 0;
		x = m.nextInt();
		Scanner n = new Scanner(System.in);
		int y = 0;
		y = n.nextInt();
		int add = x + y;
		int sub = x - y;
		int div = x/y;
		int mul = x*y;
		System.out.print("Addition: " + add);
		System.out.print("Subtraction: " + sub);
		System.out.print("Division: " + div);
		System.out.print("Multiplication: " + mul);
	}

}
