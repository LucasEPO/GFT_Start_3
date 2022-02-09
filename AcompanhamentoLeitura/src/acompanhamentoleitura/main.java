package acompanhamentoleitura;

/**
 *
 * @author LucasEPO
 */
public class main {

    public static void main(String[] args) {
        Livro livroFavorito = new Livro("Harry Potter", 600);
        Leitor leitor = new Leitor("Lucas", livroFavorito);
        
        Livro livro = new Livro("Senhor dos Aneis", 1200);
        leitor.adicionarLivro(livro);
        System.out.print("Adicionando paginas lidas: ");
        System.out.println(livro.adicionarPaginasLidas(400));
        
        leitor.getEstanteLivros();
        
        System.out.print("Progresso Livro Favorito: ");
        System.out.println(livroFavorito.verificarProgresso() + "%");
        
        System.out.print("Progresso do livro recem adicionado: ");
        System.out.println(livro.verificarProgresso() + "%");
        
        System.out.print("Progresso do livro recem removido: ");
        leitor.removerLivro(livro);
        System.out.println(livro.verificarProgresso() + "%");
        
        
        leitor.getEstanteLivros();
    }

}
