import java.util.Scanner;

public class UsaCartao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		double valor;
		
		CartaoPrePago c = new CartaoPrePago("1111 2222 3333 4444", "Magnolia Medeiros", 2028, 12);
		
		do {
			System.out.println("Bem vindo a Loja!");
			System.out.println("1-Adicionar credito / 2-Comprar / 3-Info / 0-Sair");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor a adicionar");
				valor = teclado.nextDouble();
				c.adicionarCredito(valor);
				break;
			case 2:
				System.out.println("Digite o valor da compra");
				valor = teclado.nextDouble();
				if (c.comprar(valor)) {
					System.out.println(" ---> COMPRA APROVADA!");
				} else {
					System.out.println(" ---> CREDITO INSUFICIENTE");
				}
				break;
			case 3:
				// nesse exemplo usamos uma mensagem customizada
				System.out.println("Numero do cartao: " + c.getNumeroCartao() + " - Validade: " + c.getMesValidade() + "/" + c.getAnoValidade());
				System.out.println("Titular: " + c.getNomeTitular());
				System.out.printf("Saldo R$: %.2f \n\n", c.getSaldo());
				break;
			case 0:
				System.out.println("Obrigado pela preferencia!!!");
				break;
			default:
				System.out.println(">>> Opcao invalida <<<");
			}
		} while (opcao != 0);
	}

}
