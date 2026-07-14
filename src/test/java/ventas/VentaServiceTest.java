package ventas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class VentaServiceTest {

    private ProductosRepository repositoryFake;

    private VentaService service;

    @BeforeEach
    void setUp(){  /// Estado inicial
        // 1 Mockito
        repositoryFake = mock(ProductosRepository.class);
        // 2 Inyeccion del mock
        service = new VentaService(repositoryFake);
    }

    @Test
    @DisplayName("Calculo el total cuando hay stock")
    void deberiaCalcularElTotalCuandoHayStock(){
        /// CONCEPTO -> AAA

        /// Arrange: Preparar
        when(repositoryFake.existeStock("P0001")).thenReturn(true);
        when(repositoryFake.obtenerPrecio("P0001")).thenReturn(15.0);

        /// Act: Actual / Ejecutar / Performar
        double total = service.calcularTotal("P0001", 4);

        /// Assert: Validar
        assertEquals(60.0, total);
    }

}