import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor = teclado.nextInt();
		System.out.println("Voc� digitou " + valor);

		teclado.close();
	}
}
