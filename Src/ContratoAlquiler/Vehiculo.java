package Src.ContratoAlquiler;
class Vehiculo {
    private String placa;
    private String tipo;

    public Vehiculo(String placa, String tipo) {

        if (!tipo.equalsIgnoreCase("Auto") &&
            !tipo.equalsIgnoreCase("Van") &&
            !tipo.equalsIgnoreCase("Camion")) {

            throw new IllegalArgumentException("Tipo de vehículo inválido");
        }

        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }
}