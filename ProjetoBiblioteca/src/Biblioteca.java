
public class Biblioteca {
	public static void main(String[] args) {
	
	Livro livro1, livro2, livro3;
	
	livro1 = new Livro();
	livro2 = new Livro();
	livro3 = new Livro();
	
	// preenchendo cada um dos livros
	livro1.setTitulo("Orgulho e Preconceito");
	livro1.setAutor("Jane Austen");
	livro1.setAnoPublicacao(1813);
	livro1.setCategoria("Romance");
	livro1.setPosicaoEstante(1);
	livro1.setPosicaoPrateleira(3);
	//------------------------------
	livro2.setTitulo("1984");
	livro2.setAutor("George Orwell");
	livro2.setAnoPublicacao(1984);
	livro2.setCategoria("Romance");
	livro2.setPosicaoEstante(1);
	livro2.setPosicaoPrateleira(4);
	// -----------------------------
	livro3.setTitulo("Codigo limpo-Habilidades praticas do Agile Software");
	livro3.setAutor("Robert C. Martin");
	livro3.setAnoPublicacao(2009);
	livro3.setCategoria("Computicao");
	livro3.setPosicaoEstante(2);
	livro3.setPosicaoPrateleira(4);
	
	// exibir as informacoes de todos os livros
	System.out.println(livro1.exibirInfo());
	System.out.println(livro2.exibirInfo());
	System.out.println(livro3.exibirInfo());
	}
}
