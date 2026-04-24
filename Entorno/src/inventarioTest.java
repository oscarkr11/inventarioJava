import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class inventarioTest {

    @Test
    public void testCalcularValorTotal() {
        Inventario inv = new Inventario();

        List<Producto> productos = Arrays.asList(
            new Producto("Teclado", 50, 2),
            new Producto("Ratón", 20, 1)
        );

        double resultado = inv.calcularValorTotal(productos);

        assertEquals(120, resultado);
    }

    @Test
    public void testAñadirProducto() {
        Inventario inv = new Inventario();
        Producto p = new Producto("Monitor", 200, 1);

        inv.añadirProducto(p);

        assertEquals(1, inv.getProductos().size());
    }

    @Test
    public void testProductoCreadoCorrectamente() {
        Producto p = new Producto("Tablet", 300, 3);

        assertEquals("Tablet", p.getNombre());
        assertEquals(300, p.getPrecio());
        assertEquals(3, p.getCantidad());
    }
}