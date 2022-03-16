
public class AppQueUsaTV {
	public static void main(String[] args) {
		
		// Aqui temos variaveis que usa a TV
		// Declarei...duas variaveis (tv1 e tv2) do tipo Televisao
		Televisao tv1, tv2;
		
		// Agora como estou tratando de classes, preciso DECLARAR e INSTANCIAR!!!
		tv1 = new Televisao(); // Aqui solicita a VM memoria necessaria para armazenar
		tv2 = new Televisao();
		
		// acessando os campos!
		// Atribui...
		tv1.marca = "Telefunken";
		tv1.tamanho = 20;
		tv1.canal = 5;
		tv1.ligado = false;
		tv1.volume = 1;
		
		// Atribui..
		tv2.marca = "Filipis";
		tv2.tamanho = 55;
		tv2.canal = 10;
		tv2.ligado = true;
		tv2.volume = 3;
		
		// Exibir todas as informacoes da TV
//		System.out.println("       \\/      ");
//		System.out.println("+================+");
//		System.out.println("| "+tv1.marca+"     |");
//		System.out.println("| "+tv1.tamanho+" pol         |");
//		System.out.println("| "+tv1.tamanho+" pol         |");
//		System.out.println("+================+");
//		System.out.println("  |           |   ");
		
		tv1.ligar();
		tv1.aumentarVolume();
		// Agora podemos pegar o Objeto do tipo Televisao e exibir
		// inconvamos o método exibirTV() na classe principal
		tv1.exibirTV();
		tv1.sintonizarCanal(32);
		tv1.desligar();
		tv1.aumentarVolume();
		
		System.out.println("A TV foi desligada no canal "+tv1.obterCanalSintonizado());
	}
}
