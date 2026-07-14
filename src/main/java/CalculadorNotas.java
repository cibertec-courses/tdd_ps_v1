import java.util.ArrayList;
import java.util.List;

public class CalculadorNotas {

    /// Lista notas
    private final List<Double> notas = new ArrayList<>();

    public void agragarNotas(double nota){
        if (nota <0 || nota > 20 ){
            throw  new IllegalArgumentException("La nota debe estar entre 0 y 20");
        }
        notas.add(nota);
    }

    public int contarNotas(){
        return  notas.size();
    }

    public double calcularPromedio(){
        if(notas.isEmpty()){
            return  0.0;
        }
        double suma = 0.0;

        for (double nota : notas){
            suma += nota;
        }
        return  suma / notas.size();
    }

    public double obtenerNotaMaxima(){
        if(notas.isEmpty()){
            return  0.0;
        }
        double maxima = notas.get(0);

        for (double nota : notas){
            if (nota> maxima){
                maxima = nota;
            }
        }
        return  maxima;
    }

    public String obtenerEstado(){
        double promedio = calcularPromedio();
        if (promedio>= 13){
            return  "Aprobado!";
        }
        return  "Desaprobado!";
    }

}
