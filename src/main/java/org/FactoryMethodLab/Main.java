package org.FactoryMethodLab;

/**
 * Clase principal que demuestra el uso del patrón Factory Method con mascotas.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos una fábrica de perros
        PetFactory dogFactory = new DogFactory();
        Pet dog = dogFactory.createPet(); // Creamos un perro
        dog.speak(); // El perro ladra

        // Creamos una fábrica de gatos
        PetFactory catFactory = new CatFactory();
        Pet cat = catFactory.createPet(); // Creamos un gato
        cat.speak(); // El gato maúlla
    }
}
