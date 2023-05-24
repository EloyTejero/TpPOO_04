/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpPOO_04;

/**
 *
 * @author lolo
 */

    public class Cliente extends Persona{
    
    private int telefono;

    public Cliente(int telefono, String nombre, byte edad) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "telefono=" + telefono + '}';
    }
    
    
    }

