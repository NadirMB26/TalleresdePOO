package Taller15.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Usuario
        Usuario usuario = new Usuario("jdoe", "password123", "jdoe@example.com");

        // Autenticar al usuario
        Autenticar servicioAutenticacion = new Autenticar();
        boolean autenticado = servicioAutenticacion.autenticar(usuario, "jdoe", "password123");
        System.out.println("Autenticado: " + autenticado);

        // Validar el email del usuario
        Validar servicioValidacion = new Validar();
        boolean emailValido = servicioValidacion.validarEmail(usuario);
        System.out.println("Email válido: " + emailValido);
    }
}

