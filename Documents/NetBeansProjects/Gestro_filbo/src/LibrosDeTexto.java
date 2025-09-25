public class LibrosDeTexto extends Libros {
    private String libro_curso;

    public LibrosDeTexto(String curso, String titulo, String autor, int precio) {
        super(titulo, autor, precio);
        this.libro_curso = libro_curso;
    }

    
    
    public String getCurso() {
        return libro_curso;
    }

    public void setCurso(String curso) {
        this.libro_curso = curso;
    }
    
    void CalcularDescuento(){
        total= precio-((precio*40)/100);
    }

    @Override
    public String toString() {
        return "titulo= " + titulo + ", autor= " + autor + " curso "+ libro_curso + " precio " + precio + ", total= " + total ;
    }

    
    
}
