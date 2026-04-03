public class Van extends Vehiculo {

    public Van(String placa, double autonomia) {
        super(placa, autonomia);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Van");
    }
}
