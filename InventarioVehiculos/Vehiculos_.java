
public abstract class Vehiculos_ {
    protected String placa;
    protected double autonomia;
 
    public Vehiculos_(String placa, double autonomia) {
        this.placa = placa;
        this.autonomia = autonomia;
    }
 
    public String getPlaca() {
        return placa;
    }
 
    public double getAutonomia() {
        return autonomia;
    }
 
    public abstract void mostrarTipo();
}
 
 