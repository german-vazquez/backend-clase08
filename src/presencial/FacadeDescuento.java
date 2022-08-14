package presencial;

public class FacadeDescuento implements IDescuento {
    private ApiCantidad apiCantidad;
    private ApiProducto apiProducto;
    private ApiTarjeta apiTarjeta;

    public FacadeDescuento(){
        apiCantidad = new ApiCantidad();
        apiProducto = new ApiProducto();
        apiTarjeta = new ApiTarjeta();
    }

    @Override
    public int descuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        // llamar a los métodos de las otras clases
        int descuentoFinal = 0;
        //verifica tarjeta,
        descuentoFinal = descuentoFinal+apiTarjeta.descuentoXTarjeta(tarjeta);
        // verifica producto,
        descuentoFinal = descuentoFinal+apiProducto.descuentoXProducto(producto);
        // verifica cantidad
        descuentoFinal = descuentoFinal+ apiCantidad.descuentoXCantidad(cantidad);
        return descuentoFinal;
    }
}
