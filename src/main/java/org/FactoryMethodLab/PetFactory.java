package org.FactoryMethodLab;

/**
 * Clase abstracta que define el método para crear una mascota.
 * Las subclases implementarán este método para devolver una instancia concreta de mascota.
 */
public abstract class PetFactory {
    public abstract Pet createPet(); // Método abstracto para la creación de mascotas
}
