package TpPOO_04;

public class Desayuno {
    private String nombre;
    private Double precio;
    private String descripccion;
    private int id;

    public Desayuno(String nombre, Double precio, String descripccion, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripccion = descripccion;
        this.id = id;
    }
    
    public Desayuno(String nombre, Double precio, String descripccion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripccion = descripccion;
    }
    
    public void mostrarDatos(){
        System.out.println("\t"+nombre+"\n\tDescripcion: "+descripccion+"\n\tPrecio: "+precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public int getId() {
        return id;
    }
    
    
}
