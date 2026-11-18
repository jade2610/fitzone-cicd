import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el subtotal del comprobante (S/): ");
        double subtotal = sc.nextDouble();
        try {
            double total = CalculadoraFactura.calcularTotal(subtotal);
            System.out.println("Total con IGV (18%): S/ " + total);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
