public class CalculadoraFacturaTest {
    public static void main(String[] args) {
        // Caso 1 (v1): total = subtotal + IGV 18%
        verificar(100, 118.00, "subtotal 100 -> total 118.00");

        // Caso 2 (v2): los montos <= 0 deben ser rechazados
        verificarExcepcion(0);
        verificarExcepcion(-50);

        // Caso 3 (v3): el total se redondea a 2 decimales
        verificar(99.99, 117.99, "subtotal 99.99 -> total 117.99");

        System.out.println("Todas las pruebas pasaron.");
    }

    static void verificar(double subtotal, double esperado, String caso) {
        double total = CalculadoraFactura.calcularTotal(subtotal);
        if (Math.abs(total - esperado) > 0.0001) {
            throw new AssertionError("FALLÓ: " + caso + " (obtenido " + total + ")");
        }
        System.out.println("OK: " + caso);
    }

    static void verificarExcepcion(double monto) {
        try {
            CalculadoraFactura.calcularTotal(monto);
        } catch (IllegalArgumentException e) {
            System.out.println("OK: monto " + monto + " rechazado");
            return;
        }
        throw new AssertionError("FALLÓ: monto " + monto + " debía rechazarse");
    }
}
