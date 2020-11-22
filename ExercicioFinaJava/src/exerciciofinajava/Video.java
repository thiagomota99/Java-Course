package exerciciofinajava;

public class Video implements AcoesVideo {
    private String titulo;
    private float avaliacao;
    private long views;
    private long curtidas;
    private boolean reproduzindo;
    
    //Métodos getters e setters!
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        float novaAvaliacao;
        novaAvaliacao = (int)((getAvaliacao() + avaliacao)/getViews()); 
        this.avaliacao = novaAvaliacao;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(long curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    
    public Video(String titulo){
        setTitulo(titulo);
        setAvaliacao(0);
        setCurtidas(0);
        setReproduzindo(false);
    }
    
    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
       setCurtidas(getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
