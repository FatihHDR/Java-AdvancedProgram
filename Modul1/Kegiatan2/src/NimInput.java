/**
 *
 * author @fatih
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class NimInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nim = null;
        boolean validNim = false;

        do {
            System.out.print("Masukkan nim informatika kamu (10370311, 15 digits): ");
            try {
                nim = scanner.next();
                if (nim.length() != 15 || !nim.startsWith("10370311")) {
                    throw new InvalidNimException("Format nim tidak valid. Harus dimulai dengan '10370311' dan punya 15 digit.");
                }
                validNim = true;
            } catch (InputMismatchException e) {
                System.err.println("Error: angka nim harus 15 digit, coba lagi.");
                scanner.nextLine(); // Clear the input buffer
            } catch (InvalidNimException e) {
                System.err.println(e.getMessage());
            }
        } while (!validNim);

        System.out.println("NIM valid yang dimasukkan: " + nim);
        scanner.close();
    }
}

class InvalidNimException extends Exception {
    public InvalidNimException(String message) {
        super(message);
    }
}