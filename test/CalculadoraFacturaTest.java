public class CalculadoraFacturaTest {
    public static void main(String[] args) {
        // Caso 1 (v1): total = subtotal + IGV 18%
        verificar(100, 118.00, "subtotal 100 -> total 118.00");

        System.out.println("Todas las pruebas pasaron.");
    }

    static void verificar(double subtotal, double esperado, String caso) {
        double total = CalculadoraFactura.calcularTotal(subtotal);
        if (Math.abs(total - esperado) > 0.0001) {
            throw new AssertionError("FALLÓ: " + caso + " (obtenido " + total + ")");
        }
        System.out.println("OK: " + caso);
    }
}
