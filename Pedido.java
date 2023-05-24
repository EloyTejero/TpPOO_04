package TpPOO_04;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pedido {

    private Cliente cliente;
    private ArrayList<Desayuno> desayunos;
    private double importe;
    private int id;

    public Pedido(Cliente cliente, int id, ArrayList<Desayuno> desayunos) {
        this.desayunos = desayunos;
        this.cliente = cliente;
        this.id = id;
    }


    public void descontarDesayuno(int id){
        desayunos.get(id).setPrecio(0.0);
    }



    public void calcularPrecioTotal() {
        for (Desayuno d : desayunos) {
            importe += d.getPrecio();
        }
    }


    public ArrayList<Desayuno> getDesayunos() {
        return desayunos;
    }


    public void imprimirPedido() {
        System.out.println("Pedido:  Nombre del cliente: " + cliente.getNombre() + " - importe total: " + importe);
        for (Desayuno d :desayunos){
            System.out.println(d);
        }
    }


    public Cliente getCliente() {
        return cliente;
    }
}
