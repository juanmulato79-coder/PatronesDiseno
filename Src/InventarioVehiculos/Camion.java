package Src.InventarioVehiculos;
public class Camion extends Vehiculos_ {
 
    public Camion(String placa, double autonomia) {
        super(placa, autonomia);
    }
 
    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Camión");
    }
}
 