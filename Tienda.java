/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpPOO_04;

import java.util.ArrayList;

/**
 *
 * @author ET36
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
    
    public void eliminarDesayuno(Desayuno desayuno){
        desayunos.remove(desayuno);
    }
    
    public void hacerPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public void eliminarPedido(Pedido pedido){
        pedidos.remove(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Desayuno> getDesayunos() {
        return desayunos;
    }
    
    
    
}
