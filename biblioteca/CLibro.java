package biblioteca;
public class CLibro {
    
    // Atributos sin encapsular (públicos o por defecto)
    String titulo;
    String autor;
    int numPaginas;

    // Constructor
    public CLibro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Métodos básicos del libro
    public void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado.");
    }

    public void devolver() {
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }
}