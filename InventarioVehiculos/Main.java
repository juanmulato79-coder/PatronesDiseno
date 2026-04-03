
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        Inventario inventario = new Inventario(10);
 
        int opcion;
 
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Buscar vehículo");
            System.out.println("3. Ordenar por autonomía");
            System.out.println("4. Mostrar inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
 
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
 
            switch (opcion) {
 
                case 1:
                    System.out.print("Tipo (auto/van/camion): ");
                    String tipo = sc.nextLine();
 
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
 
                    System.out.print("Autonomía: ");
                    double autonomia = sc.nextDouble();
 
                    Vehiculos_ v = VehiculoFactory.crearVehiculo(tipo, placa, autonomia);
 
                    inventario.agregar(v);
 
                    System.out.println("Vehículo agregado.");
                    break;
 
                case 2:
                    System.out.print("Placa a buscar: ");
                    String placaBuscar = sc.nextLine();
 
                    Vehiculos_ encontrado = inventario.buscar(placaBuscar);
 
                    if (encontrado != null) {
                        System.out.println("Encontrado:");
                        System.out.println("Placa: " + encontrado.getPlaca());
                        System.out.println("Autonomía: " + encontrado.getAutonomia());
                        encontrado.mostrarTipo();
                    } else {
                        System.out.println("No encontrado.");
                    }
                    break;
 
                case 3:
                    inventario.ordenarPorAutonomia();
                    System.out.println("Ordenado correctamente.");
                    break;
 
                case 4:
                    inventario.mostrar();
                    break;
 
                case 0:
                    System.out.println("Saliendo...");
                    break;
 
                default:
                    System.out.println("Opción inválida.");
            }
 
        } while (opcion != 0);
 
        sc.close();
    }
}
 
 