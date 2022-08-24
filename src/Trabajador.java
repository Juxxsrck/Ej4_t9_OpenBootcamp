public class Trabajador extends Persona{

    private int sueldo;

    public Trabajador(int edad, int telefono, String nombre, int sueldo) {
        super(edad, telefono, nombre);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
