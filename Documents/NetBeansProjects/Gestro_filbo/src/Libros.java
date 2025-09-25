abstract class Libros {
    protected String titulo,autor;
    protected int precio, total;

    public Libros(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
   
    abstract void CalcularDescuento();


    
    
    
    
}
