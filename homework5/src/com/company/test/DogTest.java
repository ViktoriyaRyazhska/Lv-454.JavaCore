package com.company.test;


import com.company.Breed;
import com.company.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DogTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void getName() {
        Dog dog = new Dog("Barsik",9, Breed.Alabay);
        Assertions.assertEquals("Barsik",dog.getName());
    }

    @Test
    void setName() {
        Dog dog = new Dog();
        dog.setName("Bobik");
        Assertions.assertEquals("Bobik", dog.getName());
    }

    @Test
    void getAge() {
      Dog dog = new Dog("Tuz",3, Breed.Vivcharka);
        Assertions.assertEquals(3,dog.getAge());
    }

    @Test
    void setAge() {
        Dog dog = new Dog();
        dog.setAge(7);
        Assertions.assertEquals(7,dog.getAge());
    }

}