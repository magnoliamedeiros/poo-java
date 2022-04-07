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
			switch(opcao) {
				case 1:
					texto = JOptionPane.showInputDialog("Digite o valor a depositar");
					valor = Double.parseDouble(texto);
					conta.depositar(valor);
					break;
				case 2:
					texto = JOptionPane.showInputDialog("Digite o valor do saque");
					valor = Double.parseDouble(texto);
					if (conta.sacar(valor)) {
						JOptionPane.showMessageDialog(null, "Deposito efetuado - novo saldo R$ "+conta.getSaldo(), "Sucesso", JOptionPane.WARNING_MESSAGE);					
					} else {
						JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Débito não autorizado", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(null, conta.exibirInfo());
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigada pela preferência!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcao invalida", "ERRO", JOptionPane.ERROR_MESSAGE );
			}
		} while (opcao != 0);
	}
}
