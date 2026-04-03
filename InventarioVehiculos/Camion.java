public class Camion extends Vehiculo {

    public Camion(String placa, double autonomia) {
        super(placa, autonomia);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Camión");
    }
}
