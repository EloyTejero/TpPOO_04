package TpPOO_04;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pedido {

    private Cliente cliente;
    private ArrayList<Desayuno> desayunos;
    private double importe;
    private int id;

    public Pedido() {
    }

    public Pedido(Cliente cliente, int id, ArrayList<Desayuno> desayunos) {
        this.desayunos = desayunos;
        this.cliente = cliente;
        this.id = id;
    }

    public boolean descuento() {
        boolean descuentoValido = false;
        if ((id%10) == 0 && id !=0) {
            descuentoValido = true;
        }

        return descuentoValido;
    }

    public void calcularPrecioTotal() {
        if (descuento()) {
            desayunos.get(0).setPrecio(0.0);
        }
        double precioTotal = 0;
        for (Desayuno d : desayunos) {
            precioTotal += d.getPrecio();
        }
        importe = precioTotal;
    }

    public void MostrarDatos() {
        System.out.println("-----------------------------------");
        System.out.println("Pedido n°"+id);
        System.out.println("A nombre de: "+cliente.getNombre());
        System.out.println("Contenido:");
        for (Desayuno d : desayunos) {
            d.mostrarDatos();
        }
        System.out.println("Precio total: "+importe);
        System.out.println("-----------------------------------");
    }

    public int getId() {
        return id;
    }
}
