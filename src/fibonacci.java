import java.util.Scanner;

public class fibonacci {
    public static int Fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su Fibonacci: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, ingrese un número no negativo.");
        } else {
            int resultado = Fibo(numero);
            System.out.println("El número Fibonacci en la posición " + numero + " es: " + resultado);
        }

        scanner.close();
    }
}
