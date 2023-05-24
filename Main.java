package TpPOO_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static Tienda tienda;
    static int id = 0;
    static int logueado = 0;
    static Cliente cliente = null;

    public static void main(String[] args) {
        tienda = new Tienda();
        menuOpciones();
    }

    public static void menuOpciones() {
        int opc = 0;
        do {
            System.out.println("Digite la opcion que desea: ");
            System.out.println("1. Hacer un pedido, 2. Eliminar un pedido, 3. Agregar un desayuno, 4. Eliminar un desayuno, 5. Mostrar pedido de cliente,6-mostrar todos los pedidos, 7-Log out  8. Terminar Programa");
            opc = in.nextInt();
            in.nextLine();
            switch (opc) {
                case 1:
                    hacerPedido();
                    break;
                case 2:
                    eliminarPedido();
                    break;
                case 3:
                    agregarDesayuno();
                    break;
                case 4:
                    eliminarDesayuno();
                    break;
                case 5:
                    mostrarPedidoCliente();
                    break;
                case 6:
                    mostrarTodosPedidos();
                    break;
                case 7:
                    logueado = 0;
            }
            System.out.println("");
        } while (opc != 8);
    }

    public static void mostrarTodosPedidos() {
        for (Pedido p : tienda.getPedidos()) {
            p.imprimirPedido();
        }
    }

    public static void mostrarPedidoCliente() {
        System.out.println("Ingrese el nombre del cliente");
        String nombre = in.nextLine();
        for (Pedido p : tienda.obtenerPedidoCliente(nombre)) {
            p.imprimirPedido();
        }
    }

    public static void eliminarDesayuno() {
        System.out.println("Ingrese el numero del desayuno a eliminar: ");
        int nro = in.nextInt();
        in.nextLine();
        tienda.eliminarDesayuno(nro);
    }

    public static void agregarDesayuno() {
        Desayuno desayuno = crearDesayuno(tienda.getDesayunos().size());
        tienda.agregarDesayuno(desayuno);
    }

    public static void hacerPedido() {
        if (logueado == 0) {
            cliente = crearCliente();
            logueado = 1;
        }
        if(tienda.getDesayunos().size()>0){
            ArrayList<Desayuno> desayunos = seleccionarDesayuno(tienda.getDesayunos());
            tienda.hacerPedido(cliente, id, desayunos);
            id++;
        }else{
            System.out.println("-----------------------------");
            System.out.println("No hay desayunos para elegir");
            System.out.println("-----------------------------");
        }
    }

    public static void eliminarPedido() {
        System.out.println("Ingrese el numero del pedido a eliminar: ");
        int nro = in.nextInt();
        in.nextLine();
        tienda.eliminarPedido(nro);
    }


    public static Cliente crearCliente() {
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

    public static Desayuno crearDesayuno(int id) {
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

    public static ArrayList<Desayuno> seleccionarDesayuno(ArrayList<Desayuno> desayunosDisponibles) {
        int opc;
        int cont = 0;
        System.out.println("digite cantidad de desayunos");
        int cantDesayunos = in.nextInt();
        ArrayList<Desayuno> desayunosSeleccionados = new ArrayList<>();
        for (int i = 0; i < cantDesayunos; i++) {

            System.out.println("Menu:");
            for (Desayuno d : desayunosDisponibles) {
                System.out.println((cont + 1) + ". " + d.toString());
                cont++;
            }
            System.out.print("Ingrese el id del que desea: ");
            opc = in.nextInt();
            in.nextLine();
            desayunosSeleccionados.add(desayunosDisponibles.get(opc));


        }


        return desayunosSeleccionados;
    }
}