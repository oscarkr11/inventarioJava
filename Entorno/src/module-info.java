import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class InventarioTest {

    @Test
    void testCalcularValorTotal() {
        Inventario inv = new Inventario();

        List<Producto> productos = Arrays.asList(
            new Producto("Teclado", 50, 2),
            new Producto("Ratón", 20, 1)
        );

        double resultado = inv.calcularValorTotal(productos);

        assertEquals(120, resultado);
    }

    @Test
    void testAñadirProducto() {
        Inventario inv = new Inventario();
        Producto p = new Producto("Monitor", 200, 1);

        inv.añadirProducto(p);

        assertTrue(inv.getProductos().contains(p));
    }

    @Test
    void testCantidadNegativa() {
        Producto p = new Producto("Tablet", 300, -2);

        assertTrue(p.getCantidad() < 0);
    }
}