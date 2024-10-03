package org.builderLab;

/**
 * Clase principal que ejecuta el ejemplo del patrón Builder.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un constructor de vehículos
        VehicleBuilder builder = new ConcreteVehicleBuilder();

        // Crear un director que construye vehículos
        VehicleDirector director = new VehicleDirector(builder);

        // Construir y mostrar un coche
        Vehicle car = director.constructCar();
        displayVehicle(car);

        // Construir y mostrar una bicicleta
        Vehicle bicycle = director.constructBicycle();
        displayVehicle(bicycle);
    }

    /**
     * Muestra información del vehículo.
     * @param vehicle El vehículo a mostrar.
     */
    private static void displayVehicle(Vehicle vehicle) {
        System.out.println(vehicle);
    }
}
