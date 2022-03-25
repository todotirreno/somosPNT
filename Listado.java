import java.util.ArrayList;

public class Listado extends ArrayList<Producto>{
    private ArrayList<Producto> listado = new ArrayList();

    @Override
    public boolean add(Producto producto) {
        return listado.add(producto);
    }

    @Override
    public String toString() {
        Producto producto;
        String productoString = "";

        for (int i = 0; i < listado.size(); i++) {
            producto = listado.get(i);
            productoString += "\n" + producto.toString();
        }
        return productoString;
    }

    public String[] caroYBarato() {
        Producto masCaro = listado.get(0);
        Producto masBarato = listado.get(0);
        Producto producto;
        for (int i = 1; i < listado.size(); i++) {
            producto = listado.get(i);
            if (producto.compareTo(masCaro) == 1)
                masCaro = producto;
            else if (producto.compareTo(masBarato) == -1)
                masBarato = producto;
        }
        // Creo un arreglo de cadenas de caracteres
        String[] caroYBarato = new String[2];
        // Le asigno el nombre del más caro a la primera posición y el del más barato a la segunda posición.
        caroYBarato[0] = masCaro.getNombre();
        caroYBarato[1] = masBarato.getNombre();
        return caroYBarato;
    }
}
