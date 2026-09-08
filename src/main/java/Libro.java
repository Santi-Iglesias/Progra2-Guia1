public class Libro {

    private static int contadorId = 1;
    private int id = 1;
    private String titulo;
    private String autor;
    private double precio;
    private int copiasDisponibles;

    //Constructor completo
    public Libro(String titulo, String autor, double precio, int copiasDisponibles) {
        this.id = contadorId;
        contadorId++;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copiasDisponibles = copiasDisponibles;
    }

    //Constructor vacio(por las dudas)
    public Libro() {
    }

    //Getter id
    public int getId() {
        return id;
    }

    //Getters y Setters resto
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public void vender(int cantidad){
        if (cantidad > copiasDisponibles){
            System.out.println("Copias insuficientes");
        } else {
            copiasDisponibles -= cantidad;
        }
    }

    public void incrementarCopias(int cantidad){
        copiasDisponibles += cantidad;
    }

    @Override
    public String toString() {
        return "Libro[id=" + id + ", título=" + titulo + ", autor=" + autor + ", precio=" + precio + ", copias disponibles=" + copiasDisponibles + "]";
    }

}
