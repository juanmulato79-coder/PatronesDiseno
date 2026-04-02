


Contrato1 contrato = new ContratoBuilder1 (cliente, vehiculo, plan)
        .agregarGPS()
        .calcularPrecio(dias)
        .build();
@
System.out.println(Contrato);

