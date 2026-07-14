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

    @Test
    @DisplayName("El promedio de 15, 15 y 15 es 15")
    void deberiaCalcularElPromedioDeVariasNotas(){
        calculadorNotas.agragarNotas(15.0);
        calculadorNotas.agragarNotas(15.0);
        calculadorNotas.agragarNotas(15.0);

        assertEquals(15.0, calculadorNotas.calcularPromedio());
    }

    @Test
    @DisplayName("Con promedio menor 13 el estado debe ser DESAPROBADO")
    void deberiaRetornarDesaprobadoCuandoElPromedioEsMenorAlMinimo(){
        calculadorNotas.agragarNotas(12.0);
        calculadorNotas.agragarNotas(11.0);
        calculadorNotas.agragarNotas(10.3);

        assertEquals("Desaprobado!".toLowerCase(), calculadorNotas.obtenerEstado().toLowerCase());
    }

}