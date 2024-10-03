package org.FactoryMethodLab;

/**
 * Clase concreta que representa un gato.
 */
public class Cat implements Pet {
    @Override
    public void speak() {
        System.out.println("Meow!"); // El gato maúlla
    }
}
