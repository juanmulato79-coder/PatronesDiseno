import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Ingrese placa del vehículo: ");
        String placa = sc.nextLine();

        // VALIDACIÓN DEL TIPO
        String tipo;
        while (true) {
            System.out.print("Ingrese tipo de vehículo (Auto/Van/Camion): ");
            tipo = sc.nextLine();

            if (tipo.equalsIgnoreCase("Auto") ||
                tipo.equalsIgnoreCase("Van") ||
                tipo.equalsIgnoreCase("Camion")) {
                break;
            } else {
                System.out.println(" Tipo inválido, intente de nuevo.");
            }
        }

        //  VALIDACIÓN DE DÍAS
        int dias;
        while (true) {
            System.out.print("Ingrese días de alquiler: ");
            dias = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (dias > 0) {
                break;
            } else {
                System.out.println("Los días deben ser mayores a 0.");
            }
        }

        Vehiculo vehiculo = new Vehiculo(placa, tipo);

        //  ACCESORIOS
        System.out.print("¿Desea GPS? (s/n): ");
        String gps = sc.nextLine();

        System.out.print("¿Desea seguro? (s/n): ");
        String seguro = sc.nextLine();

        System.out.print("¿Desea cargador? (s/n): ");
        String cargador = sc.nextLine();

        //  BUILDER
        ContratoBuilder builder = new ContratoBuilder()
                .setCliente(cliente)
                .setVehiculo(vehiculo)
                .setPlan("Premium")
                .setDias(dias);

        if (gps.equalsIgnoreCase("s")) {
            builder.agregarGPS();
        }

        if (seguro.equalsIgnoreCase("s")) {
            builder.agregarSeguro();
        }

        if (cargador.equalsIgnoreCase("s")) {
            builder.agregarCargador();
        }

        Contrato contrato = builder.build();

        contrato.mostrar();

        sc.close();
    }
}