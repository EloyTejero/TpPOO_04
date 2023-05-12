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
        int opc;
        do{
            System.out.println("Digite la opcion que desea: ");
            System.out.println("1. Hacer un pedido, 2. Eliminar un pedido, 3. Agregar un desayuno, 4. Eliminar un desayuno, 5. Mostrar pedidos, 6. Salir");
            opc = in.nextInt();
            in.nextLine();
            switch (opc) {
                case 1:
                    Pedido pedido = crearPedido(tienda.getDesayunos(),tienda.getPedidos().size());
                    tienda.hacerPedido(pedido);
                    break;
                case 2:
                    System.out.println("Ingrese el numero del pedido a eliminar: ");
                    opc = in.nextInt();
                    in.nextLine();
                    tienda.eliminarPedido(opc);
                    opc=0;
                    break;
                case 3:
                    Desayuno desayuno = crearDesayuno(tienda.getDesayunos().size());
                    tienda.agregarDesayuno(desayuno);
                    break;
                case 4:
                    System.out.println("Ingrese el numero del desayuno a eliminar: ");
                    opc = in.nextInt();
                    in.nextLine();
                    tienda.eliminarDesayuno(opc);
                    opc=0;
                    break;
                case 5:
                    for (int i = 0; i < tienda.getPedidos().size(); i++) {
                        tienda.getPedidos().get(i).calcularPrecioTotal();
                        System.out.println(tienda.getPedidos().get(i).toString());
                    }
            }
        }while(opc!=6);
    }
    
    public static Cliente crearCliente(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.print("Nombre: ");
        String nombre = in.nextLine();
        System.out.print("Telefono: ");
        int telefono = in.nextInt();
        in.nextLine();
        System.out.print("Ingrese su edad: ");
        byte edad = in.nextByte();
        
        return new Cliente(telefono, nombre, edad);
    }
    
    public static Desayuno crearDesayuno(int id){
        System.out.println("Ingrese los datos del desayuno: ");
        System.out.print("Nombre: ");
        String nombre = in.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = in.nextLine();
        System.out.print("Precio: ");
        double precio = in.nextInt();
        in.nextLine();
        
        return new Desayuno(nombre, precio, descripcion, id);
    }
    
    public static Pedido crearPedido(ArrayList<Desayuno> desayunosDisponibles, int id){
        Cliente cliente = crearCliente();
        ArrayList<Desayuno> desayunos = seleccionarDesayuno(desayunosDisponibles);
        return new Pedido(cliente,id, desayunos);
    }
    
    public static ArrayList<Desayuno> seleccionarDesayuno(ArrayList<Desayuno> desayunosDisponibles){
        int opc;
        ArrayList<Desayuno> desayunosSeleccionados = new ArrayList<>();
        do {
            int i = 0;
            System.out.println("Menu:");
            for(Desayuno d: desayunosDisponibles){
                System.out.println((i+1)+". "+d.toString());
                i++;
            }
            
            System.out.print("Ingrese el numero del que desea: ");
            opc = in.nextInt();
            in.nextLine();
            desayunosSeleccionados.add(desayunosDisponibles.get(opc-1));
            
            System.out.println("Desea agregar mas desayunos: 1:si 2:no");
            opc = in.nextInt();
            in.nextLine();
        } while (opc!=2);
        
        return desayunosSeleccionados;
    }
}