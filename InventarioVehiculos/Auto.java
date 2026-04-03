public class Auto extends Vehiculo {

    public Auto(String placa, double autonomia) {
        super(placa, autonomia);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Auto");
    }
}
