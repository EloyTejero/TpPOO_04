/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpPOO_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lolo
 */
public class Tienda {
    private ArrayList<Desayuno> desayunos;
    private ArrayList<Pedido> pedidos;

    public Tienda() {
        desayunos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }
    
    public void agregarDesayuno(Desayuno desayuno){
        desayunos.add(desayuno);
    }
    
    public void eliminarDesayuno(int idDesayuno){
        desayunos.remove(idDesayuno);
    }
    
    public void hacerPedido(Cliente cliente, int id, ArrayList<Desayuno> desayunos){
        Pedido pedido = new Pedido(cliente,id,desayunos);
        hacerDescuento(pedido);
        pedido.calcularPrecioTotal();
        pedidos.add(pedido);
        System.out.println("\npedido realizado \n-------------------------------------------------------------------------------------------------");
        pedido.imprimirPedido();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

    }


    private void hacerDescuento(Pedido pedido){
        Random randomNumber = new Random();
        int desayunoAdescontar = randomNumber.nextInt(pedido.getDesayunos().size());
        if ((pedidos.size()+1) % 11 == 0 ){
            pedido.descontarDesayuno(desayunoAdescontar);
        }
    }


    public List<Pedido> obtenerPedidoCliente(String nombreCliente){
        List<Pedido> pedidoCliente = new ArrayList<>();
        for (Pedido p : pedidos){
            if (p.getCliente().getNombre().equals(nombreCliente)){
                pedidoCliente.add(p);
            }
        }
        return pedidoCliente;
    }

    
    public void eliminarPedido(int idPedido){
        pedidos.remove(idPedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Desayuno> getDesayunos() {
        return desayunos;
    }
}
