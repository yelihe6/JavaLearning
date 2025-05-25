package chapter19_Collection.Generics.Animal;

import java.util.ArrayList;
import java.util.List;

public class breedAnimal {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        Dog dog1 = new Dog("波波",5);
        Cat cat1 = new Cat("妙妙",9);
        dogs.add(dog1);
        cats.add(cat1);
        keepDog(dogs);
        keepPet(dogs);
        keepCat(cats);
        keepPet(cats);

    }


    //狗狗
    public static void keepDog(ArrayList<? extends Dog> list){
        for (Dog d: list ) {
            System.out.println(d.eat());
        }
    }

    //猫猫
    public static void keepCat(ArrayList<? extends Cat> list){
        for (Cat d: list ) {
            System.out.println(d.eat());
        }
    }

    public static void keepPet(ArrayList<? extends Animal> list){
        for (Animal d: list ) {
            System.out.println(d.eat());
        }
    }
}
