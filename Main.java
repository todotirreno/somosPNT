import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Listado listado = crearListado();
        System.out.println(listado);
        System.out.println("=============================");
        String[] caroYBarato = listado.caroYBarato();
        System.out.println("Producto más caro: " + caroYBarato[0]);
        System.out.println("Producto menos caro: " + caroYBarato[1]);
    }

    public static Listado crearListado() {
        //Crear productos
        Producto cocaZero = new Producto("Coca-Cola Zero", "Litros: 1.5", 20);
        Producto coca = new Producto("Coca-Cola", "Litros: 1.5", 18);
        Producto sedal = new Producto("Shampoo Sedal", "Contenido: 500ml", 19);
        Producto frutillas = new Producto("Frutillas", 64, "kilo");

        //Crear listado y agregar los productos
        Listado listado = new Listado();
        listado.add(cocaZero);
        listado.add(coca);
        listado.add(sedal);
        listado.add(frutillas);

        return listado;
    }
}


