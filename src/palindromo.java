import java.util.Scanner;

public class palindromo {
    public static boolean Palindromo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            return Palindromo(cadena.substring(1, cadena.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palabrita = scanner.nextLine();

        if (Palindromo(palabrita)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        scanner.close();
    }
}
