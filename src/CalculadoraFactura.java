public class CalculadoraFactura {
    public static final double IGV = 0.18;

    // v3: el total se redondea a 2 decimales (formato de comprobante)
    public static double calcularTotal(double subtotal) {
        if (subtotal <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0");
        }
        return Math.round(subtotal * (1 + IGV) * 100.0) / 100.0;
    }
}
