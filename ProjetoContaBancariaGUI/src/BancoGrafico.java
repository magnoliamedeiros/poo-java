import javax.swing.JOptionPane;

public class BancoGrafico {
	public static void main(String[] args) {
	int opcao;
	double valor;
	String texto;
	
	ContaBancaria conta = new ContaBancaria();
	
	conta.setCpf("987.765.432-00");
	conta.setNomeTitular("Magnolia Medeiros");
	conta.setNumeroConta(123456);
	conta.setTipo(2);
	conta.setSaldo(1000.00);
	
	do {
		texto = JOptionPane.showInputDialog("IsiBANK - Seu banco na NET \n 1-Deposito | 2-Saque | 3-Info | 0-Encerrar");
		opcao = Integer.parseInt(texto);
	} while (opcao != 0);
	
	}
}
