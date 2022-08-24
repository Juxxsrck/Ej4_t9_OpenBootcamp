public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(30, 32132342, "Justine Pulido", 10500);
        System.out.println("El cliente es: "  + cliente.getNombre());
        System.out.println("La edad de " + cliente.getNombre() + " es de: " + cliente.getEdad());
        System.out.println("El telefono de " + cliente.getNombre() + " es: " + cliente.getTelefono());
        System.out.println("El credito de " + cliente.getNombre() + " es de: " + cliente.getCredito() + " euros.");
    }
}
