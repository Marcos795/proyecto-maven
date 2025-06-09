package es.vedruna;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidadorApp {

    //Define la forma valida del email
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    //Validador de strings
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    // Lógica de validación y codigo de entrada/salida
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un correo electrónico: ");
        String email = scanner.nextLine();

        boolean esValido = esEmailValido(email);

        if (esValido) {
            System.out.println(email + " es un correo válido.");
        } else {
            System.out.println(email + " NO es un correo válido.");
        }

        scanner.close();
    }

    //Metodo de validacion
    public static boolean esEmailValido(String email) {
        if (email == null) return false;
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
