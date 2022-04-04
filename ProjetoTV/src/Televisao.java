/*
 * Nao tem metodo main
 * A ideia eh que a classe Televisao seja apenas para armazenar as
 * informacoes relativas a uma TV
 */
public class Televisao {
	// Aqui defino os atributos (variaveis) que compoem sua definicao
	String marca;
	int tamanho;
	int canal;
	int volume;
	boolean ligado;
	
	// Criamos o método exibirTV
	// dentro dos ( ) sao as entradas que preciso e na frente da palavra 'exibirTV'o tipo de saida, que neste caso eh void
	void exibirTV() { 
		// Exibir todas as informacoes da TV
		System.out.println("| "+ marca +"  ");
		System.out.println("| "+ canal +"    canal ");
		System.out.println("| "+ tamanho +"    pol ");
		System.out.println("+=================+");
	}
	
	void ligar() {
		ligado = true;
		System.out.println("A TV " + marca + " agora esta ligada!");
	}
	void desligar() {
		ligado = false;
		System.out.println("A TV " + marca + " foi desliga!" );
	}
	void aumentarVolume() {
		if (!ligado) {
			System.out.println("Por favor, antes ligue a TV "+marca);
		}
		else {
			volume++;
			System.out.println("Agora a TV "+marca+" esta no volume "+volume);
		}
	}
	void avancarCanal() {
		if (!ligado) {
			System.out.println("Para mudar o canal, ligue a TV!");
		}
		else {
			canal++;
			System.out.println("Agora a TV "+marca+" esta no canal "+canal);
		}
	}
	
	// tem uma entrada
	void sintonizarCanal(int novoCanal) {
		if (!ligado) {
			System.out.println("Para sintonizar, ligue a TV");
		}
		else {
			if (novoCanal <= 0 || novoCanal > 999) {
				System.out.println("Erro - canal invalido");
			}
			else {
				canal = novoCanal;
				System.out.println("Agora a TV "+marca+" esta no canal "+canal);
			}
		}
	}
	
	// tem saida
	int obterCanalSintonizado() {
		return canal;
	}


}
