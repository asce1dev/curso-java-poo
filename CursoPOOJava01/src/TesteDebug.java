import java.util.Scanner;

public class TesteDebug {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int divisor = scanner.nextInt();
		
		for (int i = 100; i <= 120; i++) {
			if (i % divisor == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Fim do programa...");
		scanner.close();
	}
}
