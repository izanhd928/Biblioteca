package biblioteca;

/**
 * Clase CLibro que representa un libro en una biblioteca
 * Encapsulamiento: Atributos privados con getters y setters
 * Constructor para inicializar los atributos
 * Métodos para simular el préstamo y devolución de un libro
 */

public class CLibro {
    
private String titulo;
private String autor;
private int numPaginas;

/**
 * Encapsulamiento: Atributos privados para proteger la integridad de los datos
 * @param titulo
 * @param autor
 * @param numPaginas
 * @return
 */

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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
/**
 * Constructor de la clase CLibro
 */
    public CLibro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    /**
     * Simula el préstamo de un libro
     */
    public void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado.");
    }

    public void devolver() {
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }
}