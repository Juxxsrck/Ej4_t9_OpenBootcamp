public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(30, 32132342, "Justine Pulido", 10500);
        System.out.println("El cliente es: "  + cliente.getNombre());
        System.out.println("La edad de " + cliente.getNombre() + " es de: " + cliente.getEdad() + " años.");
        System.out.println("El telefono de " + cliente.getNombre() + " es: " + cliente.getTelefono());
        System.out.println("El credito de " + cliente.getNombre() + " es de: " + cliente.getCredito() + " euros.");

        System.out.println();
        System.out.println();

        Trabajador trabajador = new Trabajador(21, 31509873, "James Barreto", 2000);
        System.out.println("El trabajador es: " + trabajador.getNombre());
        System.out.println("La edad de " + trabajador.getNombre() + " es de: " + trabajador.getEdad() + " años.");
        System.out.println("El telefono de " + trabajador.getNombre() + " es: " + trabajador.getTelefono());
        System.out.println("El sueldo de " + trabajador.getNombre() + " es de: " + trabajador.getSueldo() + " euros.");
    }

}
