package org.FactoryMethodLab;


/**
 * Clase concreta que representa un perro.
 */
public class Dog implements Pet {
    @Override
    public void speak() {
        System.out.println("Woof!"); // El perro ladra
    }
}
