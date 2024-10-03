package org.builderLab;

/**
 * Clase que representa un vehículo.
 * Esta clase es inmutable, es decir, no puede cambiar después de ser construida.
 */
public class Vehicle {
    private final String type; // Tipo de vehículo (Coche, Bicicleta, etc.)
    private final int wheels; // Número de ruedas
    private final String color; // Color del vehículo
    private final String model; // Modelo del vehículo

    /**
     * Constructor de la clase Vehicle.
     * Este constructor recibe todos los parámetros que forman parte del objeto Vehicle.
     *
     * @param type   Tipo de vehículo.
     * @param wheels Número de ruedas.
     * @param color  Color del vehículo.
     * @param model  Modelo del vehículo.
     */
    public Vehicle(String type, int wheels, String color, String model) {
        this.type = type;
        this.wheels = wheels;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("Vehicle Details:\n-----------------\nType: %s\nWheels: %d\nColor: %s\nModel: %s\n",
                type, wheels, color, model);
    }
}
