public class CalculadoraFactura {
    public static final double IGV = 0.18;

    // v2: se rechazan los montos menores o iguales a cero
    public static double calcularTotal(double subtotal) {
        if (subtotal <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0");
        }
        return subtotal * (1 + IGV);
    }
}
