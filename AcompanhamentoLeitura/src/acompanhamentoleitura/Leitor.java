package acompanhamentoleitura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LucasEPO
 */
public class Leitor {
    private String nome;
    private Livro livroFavorito;
    private List<Livro> estanteLivros;

    public Leitor(String nome, Livro livroFavorito) {
        this.nome = nome;
        this.livroFavorito = livroFavorito;
        
        estanteLivros = new ArrayList<>();
        estanteLivros.add(livroFavorito);
    }


    public List<Livro> getEstanteLivros() {
        System.out.println("[");
        for(int i=0; i<estanteLivros.size(); i++){
            System.out.print(estanteLivros.get(i).getTitulo());
            System.out.print(", " + estanteLivros.get(i).getTitulo() + ";\n");
        }
        System.out.println("]");
        return estanteLivros;
    }

    public void setEstanteLivros(List<Livro> estanteLivros) {
        this.estanteLivros = estanteLivros;
    }

    
    public void adicionarLivro(Livro livro) {
        this.estanteLivros.add(livro);
        livro.setPaginasLidas(0);
    }
    
    public void removerLivro(Livro livro) {
        livro.setPaginasLidas(0);
        this.estanteLivros.remove(livro);
    }
}
