package Src.ContratoAlquiler;
class Contrato {
    private String cliente;
    private Vehiculo vehiculo;
    private String plan;
    private boolean gps;
    private boolean seguro;
    private boolean cargador;
    private int dias;
    private double costo;

    public void mostrar() {
        System.out.println("===== CONTRATO =====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Vehículo: " + vehiculo.getTipo() + " - " + vehiculo.getPlaca());
        System.out.println("Plan: " + plan);
        System.out.println("GPS: " + gps);
        System.out.println("Seguro: " + seguro);
        System.out.println("Cargador: " + cargador);
        System.out.println("Días: " + dias);
        System.out.println("Costo total: " + costo);
    }

    // setters
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public void setPlan(String plan) { this.plan = plan; }
    public void setGps(boolean gps) { this.gps = gps; }
    public void setSeguro(boolean seguro) { this.seguro = seguro; }
    public void setCargador(boolean cargador) { this.cargador = cargador; }
    public void setDias(int dias) { this.dias = dias; }
    public void setCosto(double costo) { this.costo = costo; }

    public int getDias() { return dias; }
}