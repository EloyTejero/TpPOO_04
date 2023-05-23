package TpPOO_04;

public class Persona {
    String nombre;
    byte edad;

    public Persona(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    public String getNombre() {
        return nombre;
    }
}
