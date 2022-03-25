public class Producto implements Comparable<Producto>{

    private String nombre;
    private int precio;
    private String contenido;
    private String unidadDeVenta;

    public Producto(String nombre, String contenido, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.contenido = contenido;
        this.unidadDeVenta = "";
    }

    public Producto(String nombre, int precio, String unidadDeVenta) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidadDeVenta = unidadDeVenta;
        this.contenido = "";
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public String getContenido() {
        return this.contenido;
    }

    public String getUnidadDeVenta() {
        return this.unidadDeVenta;
    }

    @Override
    public String toString() {
        String productoString = "Nombre: " + this.nombre + " /// ";
        if (this.contenido != "")
            productoString += this.contenido + " /// ";
        productoString += "Precio: $" + precio;
        if (unidadDeVenta != "")
            productoString += " /// Unidad de venta: " + unidadDeVenta;
        return productoString;
    }

    @Override
    public int compareTo(Producto producto) {
        if (this.precio > producto.getPrecio())
            return 1;
        else if (this.precio < producto.getPrecio())
            return -1;
        else
            return 0;
    }
}
