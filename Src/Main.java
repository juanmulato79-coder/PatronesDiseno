package Src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Escenario 1 - Inventario");
            System.out.println("2. Escenario 2 - Contrato");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Src.InventarioVehiculos.Main.main(null);
                    break;

                case 2:
                    Src.ContratoAlquiler.Main.main(null);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}