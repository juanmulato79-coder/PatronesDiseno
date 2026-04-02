public class Main {
    public static void main(String[] args) {

        Contrato contrato = new ContratoBuilder("Juan", "Tesla Model 3", "Premium")
                .agregarGPS()
                .agregarSeguro()
                .calcularPrecio(35)
                .build();

        System.out.println("Cliente: " + contrato.cliente);
        System.out.println("Vehículo: " + contrato.vehiculo);
        System.out.println("Precio final: " + contrato.precioFinal);
    }
}
