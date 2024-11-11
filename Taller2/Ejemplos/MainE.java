public class MainE {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(50000);

        // Intentar acceder directamente a la propiedad privada 'salario'
        // Esto provocará errores de compilación
        // System.out.println(empleado.salario);

        // Mostrar detalles usando el método toString()
        System.out.println(empleado);
    }
}
