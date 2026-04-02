package Mejora;

public class Contrato1 {

    private String cliente;
    private String vehiculo;
    private String plan;
    private boolean gps;
    private boolean seguro;
    private boolean cargador;
    private double precioFinal;

    // Constructor vacío (solo para Builder)
    public Contrato1() {}

    // Getters
    public String getCliente() {
        return cliente;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public String getPlan() {
        return plan;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    // Setters (solo accesibles dentro del paquete o builder)
    void setCliente(String cliente) {
        this.cliente = cliente;
    }

    void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    void setPlan(String plan) {
        this.plan = plan;
    }

    void setGps(boolean gps) {
        this.gps = gps;
    }

    void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    void setCargador(boolean cargador) {
        this.cargador = cargador;
    }

    void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    // Método útil (NO rompe Builder)
    public void mostrarResumen() {
        System.out.println("----- CONTRATO -----");
        System.out.println("Cliente: " + cliente);
        System.out.println("Vehículo: " + vehiculo);
        System.out.println("Plan: " + plan);
        System.out.println("Precio: " + precioFinal);
    }

    // toString (muy importante para nota)
    @Override
    public String toString() {
        return "Cliente: " + cliente +
               ", Vehículo: " + vehiculo +
               ", Plan: " + plan +
               ", Precio: " + precioFinal;
    }
}


