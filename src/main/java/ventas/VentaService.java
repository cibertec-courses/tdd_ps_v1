package ventas;

public class VentaService {

    private final ProductosRepository repository;

    public VentaService(ProductosRepository repository) {
        this.repository = repository;
    }

    public double calcularTotal(String codigo, int cantidad){
        if (cantidad<1){
            throw new  IllegalArgumentException("La cantidad debe ser al menos 1");
        }
        if(!repository.existeStock(codigo)){
            throw  new IllegalStateException("No existe stock del producto");
        }

        double precio = repository.obtenerPrecio(codigo);
        return  precio * cantidad;
    }



}
