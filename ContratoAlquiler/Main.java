import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Ingrese placa del vehículo: ");
        String placa = sc.nextLine();

        System.out.print("Ingrese tipo de vehículo: ");
        String tipo = sc.nextLine();

        System.out.print("Ingrese días de alquiler: ");
        int dias = sc.nextInt();

        Vehiculo vehiculo = new Vehiculo(placa, tipo);

        Contrato contrato = new ContratoBuilder()
                .setCliente(cliente)
                .setVehiculo(vehiculo)
                .setPlan("Premium")
                .setDias(dias)
                .build();

        contrato.mostrar();
    }
}