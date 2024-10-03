package org.builderLab;

/**
 * Clase que dirige la construcción de objetos Vehicle.
 * Usa un builder para construir diferentes configuraciones de vehículos.
 */
public class VehicleDirector {
    private final VehicleBuilder builder; // El builder usado para construir el vehículo

    /**
     * Constructor de VehicleDirector.
     *
     * @param builder El builder que se usará para construir los vehículos.
     */
    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construye un coche.
     *
     * @return Objeto Vehicle configurado como coche.
     */
    public Vehicle constructCar() {
        return builder.setType("Car")
                .setWheels(4)
                .setColor("Red")
                .setModel("Sedan")
                .build();
    }

    /**
     * Construye una bicicleta.
     *
     * @return Objeto Vehicle configurado como bicicleta.
     */
    public Vehicle constructBicycle() {
        return builder.setType("Bicycle")
                .setWheels(2)
                .setColor("Blue")
                .setModel("Mountain")
                .build();
    }
}
