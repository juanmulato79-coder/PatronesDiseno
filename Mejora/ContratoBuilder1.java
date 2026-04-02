package Mejora;

public class ContratoBuilder1 {
     private Contrato1 contrato;

    public ContratoBuilder1 (String cliente, String vehiculo, String plan) {
        contrato = new Contrato1();
        contrato.setCliente(cliente);
        contrato.setVehiculo(vehiculo);
        contrato.setPlan(plan);
    }

    public ContratoBuilder1 agregarGPS() {
        contrato.setGps(true);
        return this;
    }

    public ContratoBuilder1 agregarSeguro() {
        contrato.setSeguro(true);
        return this;
    }

    public ContratoBuilder1 agregarCargador() {
        contrato.setCargador(true);
        return this;
    }

    public ContratoBuilder1 calcularPrecio(int dias) {
        double base = 100 * dias;

        if (dias > 30) {
            base *= 0.9;
        }

        contrato.setPrecioFinal(base);
        return this;
    }

    public Contrato1 build() {
        return contrato;
    }   
}
