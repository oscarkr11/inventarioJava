import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Añadir producto
    public void añadirProducto(Producto p) {
        productos.add(p);
    }

    // Obtener lista
    public List<Producto> getProductos() {
        return productos;
    }

    // Calcular valor total
    public double calcularValorTotal(List<Producto> productos) {
        double total = 0;

        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
        }

        return total;
    }
}