public class Investigacion  extends Libros{
    private String facultad;

    public Investigacion(String facultad, String titulo, String autor, int precio) {
        super(titulo, autor, precio);
        this.facultad = facultad;
    }

    
    
    public void setFacultad(String facultad_libro) {
        this.facultad = facultad_libro;
    }

    public String getFacultad_libro() {
        return facultad;
    }
    
    void CalcularDescuento(){
        total= precio-((precio*25)/100);
    }


    @Override
    public String toString() {
        return "titulo= " + titulo + ", autor= " + autor + ", facultad "+ facultad + ", precio " + precio + ", total=" + total ;
    }    
    
}
