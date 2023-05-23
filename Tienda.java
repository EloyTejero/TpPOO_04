package TpPOO_04;

import java.util.ArrayList;

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
        if(idDesayuno<pedidos.size() && idDesayuno>=0){
            desayunos.remove(idDesayuno);
        }
        else{
            System.out.println("No existe ese desayuno");
        }
    }
    
    public void hacerPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public void eliminarPedido(int idPedido){
        if(idPedido<pedidos.size() && idPedido>=0){
            pedidos.remove(idPedido);
        }
        else{
            System.out.println("No existe ese pedido");
        }
    }
    
    public void mostrarUnPedido(int id){
        if(id<pedidos.size() && id>=0){
            pedidos.get(id).MostrarDatos();
        }
        else{
            System.out.println("No existe ese pedido");
        }
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Desayuno> getDesayunos() {
        return desayunos;
    }
}
