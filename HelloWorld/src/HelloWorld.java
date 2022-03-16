import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor = teclado.nextInt();
		System.out.println("Você digitou " + valor);

		teclado.close();
	}
}
