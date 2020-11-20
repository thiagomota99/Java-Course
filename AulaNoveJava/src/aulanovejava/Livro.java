package aulanovejava;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalDePaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Construtor vazio da classe!
    public Livro() {
        
    }
    
    //Construtor padrão da classe!
    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    //Métodos especias da classe: Getters e Setters.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
 
    
    //Demais métodos da classe!
    public String detalhes() {
        return "Livro{" + "titulo="
                + titulo + "\n, autor=" + autor + 
                "\n, totalDePaginas=" + totalDePaginas + 
                "\n, paginaAtual=" + paginaAtual + 
                "\n, aberto=" + aberto + 
                "\n, leitor=" + leitor.getNome() +
                "\n, Idade do leitor=" + leitor.getIdade() +
                "\n, Seox do leitor=" + leitor.getSexo() + '}';
    }

    //Métodos a serem implementados da interface Publicacação!
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
       if(pagina <= getTotalDePaginas()){
          setPaginaAtual(pagina); 
       }
       else{
          setPaginaAtual(0);
       }
       
    }

    @Override
    public void avancarPagina() {
        setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        setPaginaAtual(getPaginaAtual() - 1);
    }
}
