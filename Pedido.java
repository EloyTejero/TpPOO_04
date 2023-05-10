package TpPOO_04;

import java.util.ArrayList;


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
    
    public boolean descuento(){
        boolean descuentoValido=false;
        if(id%11==0){
            descuentoValido=true;
        }
        
        return descuentoValido;
    }
    
    public void calcularPrecioTotal(){
        if(descuento()){
            importe = 0;
            return;
        }
        
        double precioTotal=0;
        for(Desayuno d: desayunos){
            precioTotal += d.getPrecio();
        }
        importe = precioTotal;
    }

    @Override
    public String toString() {
        return "Pedido{Nombre del cliente: "+cliente.getNombre()+"importe=" + importe + '}';
    }
    
    
    
}
