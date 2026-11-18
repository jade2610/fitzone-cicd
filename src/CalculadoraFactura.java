public class CalculadoraFactura {
    public static final double IGV = 0.18;

    // v1: calcula el total con IGV, sin validar el monto ingresado
    public static double calcularTotal(double subtotal) {
        return subtotal * (1 + IGV);
    }
}
