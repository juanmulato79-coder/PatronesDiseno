
public class ContratoBuilder {
    private Contrato contrato;
    
    public ContratoBuilder(String cliente, String vehiculo, String plan) {
        contrato = new Contrato();
        contrato.cliente = cliente;
        contrato.vehiculo = vehiculo;
        contrato.plan = plan;
    }

    public ContratoBuilder agregarGPS() {
        contrato.gps = true;
        return this;
    }

    public ContratoBuilder agregarSeguro() {
        contrato.seguro = true;
        return this;
    }

    public ContratoBuilder agregarCargador() {
        contrato.cargador = true;
        return this;
    }

    public ContratoBuilder calcularPrecio(int dias) {
        double base = 100 * dias;

        if (dias > 30) {
            base *= 0.9; // descuento
        }

        contrato.precioFinal = base;
        return this;
    }

    public Contrato build() {
        return contrato;
    }
}    

