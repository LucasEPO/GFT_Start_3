package acompanhamentoleitura;

/**
 *
 * @author LucasEPO
 */
public class Livro {
    private String Titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String Titulo, int qtdPaginas) {
        this.Titulo = Titulo;
        this.qtdPaginas = qtdPaginas;
        
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
    
    public double verificarProgresso() {
       double progresso = Math.floor(getPaginasLidas() * 100 /getQtdPaginas());
       return progresso;
       
    }
    
    public int adicionarPaginasLidas(int paginasLidas) {
        setPaginasLidas(this.paginasLidas + paginasLidas);
        return getPaginasLidas();
    }
}
