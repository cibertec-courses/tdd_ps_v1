import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorNotasTest {
    //  obtjeto bajo prueba
    private CalculadorNotas calculadorNotas;

    @BeforeEach
    void setUp(){
        calculadorNotas = new CalculadorNotas();
    }

    @Test
    @DisplayName("El promedio sin notas es cero")
    void deberiaRetornarCeroCUandoNoTieneNotas(){
        double promedio = calculadorNotas.calcularPromedio();
        assertEquals(0.0, promedio);
    }

    @Test
    @DisplayName("EL promedio con resultado decimal se calcula correctamente")
    void deberiaCalcularElPromedioConDecimales(){
        calculadorNotas.agragarNotas(15.2);
        calculadorNotas.agragarNotas(17.5);
        assertEquals(16.35, calculadorNotas.calcularPromedio());
    }



}