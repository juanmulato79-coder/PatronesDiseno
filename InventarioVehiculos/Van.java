public class Van extends Vehiculos_ {
 
    public Van(String placa, double autonomia) {
        super(placa, autonomia);
    }
 
    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Van");
    }
}
 