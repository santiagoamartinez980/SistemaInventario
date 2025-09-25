public class Novelas extends Libros {
    private String genero;

    public Novelas(String tipo, String titulo, String autor, int precio) {
        super(titulo, autor, precio);
        this.genero = tipo;
    }

    
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    void CalcularDescuento(){
        total= precio-((precio*15)/100);
    }

    @Override
    public String toString() {
        return "titulo= " + titulo + ", autor= " + autor + ", genero "+ genero + ", precio " + precio + ", total= " + total ;
    }
    
    
}
