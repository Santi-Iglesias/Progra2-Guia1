public class ItemVenta {

    int id;
    String descripcion;
    int cantidad;
    double precioUnitario;

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal(){
        return precioUnitario*cantidad;
    }

    public String toString() {
        return "ItemVenta[id= " + id + " descripcion= " + descripcion + " cantidad= " + cantidad + " precio unitario= " + precioUnitario + " precio total= " + calcularPrecioTotal() + "]";
    }
}
