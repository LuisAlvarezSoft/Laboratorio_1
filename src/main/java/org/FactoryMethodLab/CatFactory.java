package org.FactoryMethodLab;


/**
 * Fábrica concreta que crea una instancia de gato.
 */
public class CatFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Cat(); // Retorna una instancia de Cat
    }
}
