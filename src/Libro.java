public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro() {
        this("", "", true);
    }

    public Libro(String titulo, String autor) {
        this(titulo, autor, true);
    }

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible para prestar.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor + "', disponible=" + disponible + "}";
    }
}