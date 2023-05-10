package TpPOO_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static Scanner in = new Scanner(System.in); 
    
    public static void main(String[] args ){
        Tienda tienda = new Tienda();
        menuOpciones(tienda);
    }
    
    public static void menuOpciones(Tienda tienda){
        System.out.println("Digite la opcion que desea: ");
        System.out.println("1. Hacer un pedido, 2. Elminar un pedido, 3. Agregar un desayuno, 4. Eliminar un desayuno");
        int opc = in.nextInt();
        in.nextLine();
        switch (opc) {
            case 1:
                crearPedido(tienda.getDesayunos(),tienda.getPedidos().size());
                break;
        }
    }
    
    public static Cliente crearCliente(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.print("Nombre: ");
        String nombre = in.nextLine();
        System.out.print("Telefono: ");
        int telefono = in.nextInt();
        in.nextLine();
        byte edad = in.nextByte();
        
        return new Cliente(telefono, nombre, edad);
    }
    
    public static Pedido crearPedido(ArrayList<Desayuno> desayunosDisponibles, int id){
        Cliente cliente = crearCliente();
        ArrayList<Desayuno> desayunos = seleccionar(desayunosDisponibles);
        return new Pedido(cliente,id, desayunos);
    }
    
    public static ArrayList<Desayuno> seleccionar(ArrayList<Desayuno> desayunosDisponibles){
        int i = 0;
        int opc = 0;
        ArrayList<Desayuno> desayunosSeleccionados = new ArrayList<>();
        do {   
            System.out.println("Menu:");
            for(Desayuno d: desayunosDisponibles){
                System.out.println(i+". "+d.toString());
                i++;
            }
            
            System.out.print("Ingrese el numero del que desa: ");
            opc = in.nextInt();
            in.nextLine();
            desayunosSeleccionados.add(desayunosDisponibles.get(opc-1));
            
            System.out.println("Desea agregar mas desayunos: 1:si 2:no");
            opc = in.nextInt();
        } while (opc!=2);
    }
}