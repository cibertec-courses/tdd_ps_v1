import java.util.ArrayList;
import java.util.List;

public class InventarioAlmacen {

    private final List<String> productos = new ArrayList<>();

    private final int capacidadMaxima;

    public InventarioAlmacen(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void ingresarProducto(String nombre){

        if(nombre == null || nombre.trim().isEmpty()){
            throw  new IllegalArgumentException("El nombre no puede ser nulo o vacio");
        }

        if(productos.size() >= capacidadMaxima){
            throw new IllegalStateException("Almacen lleno");
        }
        productos.add(nombre);
    }

    public boolean existeProducto(String nombre){
        return  productos.contains(nombre);
    }

    public int contarProductos(){
        return  productos.size();
    }

    public boolean retirarProducto(String nombre){
        return  productos.remove(nombre);
    }

    public int espacioDisponible(){
        return  capacidadMaxima - productos.size();
    }

}
