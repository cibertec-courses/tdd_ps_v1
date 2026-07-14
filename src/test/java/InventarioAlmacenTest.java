import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InventarioAlmacenTest {

    private InventarioAlmacen inventario;

    @BeforeAll
    static void startSuite(){
        System.out.println("INICIANDO PRUEBAS DE INVENTARIO");
    }

    @BeforeEach
    void setUp(){
        inventario = new InventarioAlmacen(5);
        inventario.ingresarProducto("Tarjeta Grafica");
        inventario.ingresarProducto("Parlante");
        System.out.println("Iniciando Almacen con " +inventario.contarProductos()
                + " productos");

    }

    @Test
    @DisplayName("INgresar un producto y el contador aumente")
    void deberiaAumentarElContadorAlINgresarProducto(){
        int cantidadInicial = inventario.contarProductos();
        inventario.ingresarProducto("Teclado");
        assertTrue(cantidadInicial < inventario.contarProductos());
    }

    @Test
    @DisplayName("Retirar un producto existente y se descuente")
    void deberiaRetirarProductoExistente (){
        int cantidadInicial = inventario.contarProductos();
        boolean retirado = inventario.retirarProducto("Parlante");
        assertTrue(retirado);
        assertTrue(cantidadInicial > inventario.contarProductos());
    }

    @AfterEach
    void teardown(){
        System.out.println("TEST FINALIZADO");
    }

    @AfterAll
    static void teardonwSuite(){
        System.out.println("PRUBEAS INVENTARIO COMPLETADAS");
    }

}