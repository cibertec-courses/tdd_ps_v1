package ventas;

public interface ProductosRepository {

    double obtenerPrecio(String codigo);
    boolean existeStock(String codigo);

}
