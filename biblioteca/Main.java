package biblioteca;
public class Main {
    
    public static void main(String[] args) {
        // Variable a renombrar en el Bloque 1
        CLibro libro1 = new CLibro("El Quijote", "Miguel de Cervantes", 863);

        // Operaciones a agrupar en el método 'operativa_libro'
        operativa_libro(libro1, 5);
        
        libro1.prestar();
        libro1.devolver();
    }

    private static void operativa_libro(CLibro libro1, int ejemplares) {
        System.out.println("Datos del libro:");
        System.out.println("Título: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Páginas: " + libro1.numPaginas);
    }
}