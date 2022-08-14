package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeDescuentoTest {
    @Test
    public void descuento20Test(){
        //dado
        FacadeDescuento facadeDescuento = new FacadeDescuento();
        Tarjeta tarjeta = new Tarjeta("1235461534344", "Star Bank");
        Producto producto = new Producto("pecao", "Latas");
        int cantidad = 13;
        int descuentoEsperado = 45;

        //cuando
        int descuentoReal = facadeDescuento.descuento(tarjeta, producto, cantidad);

        //entonces
        assertEquals(descuentoEsperado, descuentoReal);
    }


}