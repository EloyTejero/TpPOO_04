package TpPOO_04;


public class Cliente extends Persona{
    
    int telefono;
    
    public Cliente(int telefono, String nombre, byte edad) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "telefono=" + telefono + '}';
    }    
}

