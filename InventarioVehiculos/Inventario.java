
public class Inventario {
 
    private Vehiculos_[] vehiculos;
    private int contador;
 
    public Inventario(int tamaño) {
        vehiculos = new Vehiculos_ [tamaño];
        contador = 0;
    }
 
    public void agregar(Vehiculos_ v) {
        if (contador < vehiculos.length) {
            vehiculos[contador] = v;
            contador++;
        } else {
            System.out.println("Inventario lleno.");
        }
    }
 
    public Vehiculos_ buscar(String placa) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                return vehiculos[i];
            }
        }
        return null;
    }
 
    public void ordenarPorAutonomia() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (vehiculos[j].getAutonomia() > vehiculos[j + 1].getAutonomia()) {
 
                    Vehiculos_ temp = vehiculos[j];
                    vehiculos[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = temp;
                }
            }
        }
    }
 
    public void mostrar() {
        System.out.println("\n--- INVENTARIO ---");
 
        for (int i = 0; i < contador; i++) {
            System.out.println("Placa: " + vehiculos[i].getPlaca());
            System.out.println("Autonomía: " + vehiculos[i].getAutonomia());
            vehiculos[i].mostrarTipo();
            System.out.println("----------------------");
        }
    }
}
 