/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpPOO_04;

/**
 *
 * @author ET36
 */
public class Desayuno {
    String nombre;
    Double precio;
    String descripccion;

    public Desayuno(String nombre, Double precio, String descripccion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripccion = descripccion;
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
    
    

    @Override
    public String toString() {
        return "Desayuno{" + "nombre=" + nombre + ", precio=" + precio + ", descripccion=" + descripccion + '}';
    }
    
}
