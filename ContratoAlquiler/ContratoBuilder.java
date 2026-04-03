class ContratoBuilder {
    private Contrato contrato;

    public ContratoBuilder() {
        contrato = new Contrato();
    }

    public ContratoBuilder setCliente(String cliente) {
        contrato.setCliente(cliente);
        return this;
    }

    public ContratoBuilder setVehiculo(Vehiculo vehiculo) {
        contrato.setVehiculo(vehiculo);
        return this;
    }

    public ContratoBuilder setPlan(String plan) {
        contrato.setPlan(plan);
        return this;
    }

    public ContratoBuilder agregarGPS() {
        contrato.setGps(true);
        return this;
    }

    public ContratoBuilder agregarSeguro() {
        contrato.setSeguro(true);
        return this;
    }

    public ContratoBuilder agregarCargador() {
        contrato.setCargador(true);
        return this;
    }

    public ContratoBuilder setDias(int dias) {
        contrato.setDias(dias);
        return this;
    }

    public Contrato build() {
        // Validación obligatoria
        if (contrato.getDias() <= 0) {
            throw new IllegalStateException("Los días deben ser mayores a 0");
        }

        double costo = 100 * contrato.getDias();

        // Regla del enunciado
        if (contrato.getDias() > 30) {
            costo *= 0.9; // 10% descuento
        }

        contrato.setCosto(costo);
        return contrato;
    }
}