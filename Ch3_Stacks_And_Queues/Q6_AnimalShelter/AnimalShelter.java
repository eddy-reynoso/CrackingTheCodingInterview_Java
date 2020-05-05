package Ch3_Stacks_And_Queues.Q6_AnimalShelter;

import java.util.*;

public class AnimalShelter {

    AnimalNode firstDog;
    AnimalNode firstCat;
    AnimalNode first;

    AnimalNode lastDog;
    AnimalNode lastCat;
    AnimalNode last;

    public AnimalShelter() {
        firstDog = null;
        firstCat = null;
        first = null;
        lastDog = null;
        lastCat = null;
        last = null;
    }

    AnimalNode dqAny() {
        if (first == null) {
            return new AnimalNode("Pet Rock", "Pet Rock");
        }
        if (first.type.equals("dog")) {
            return dqDog();
        } else {
            return dqCat();
        }
    }

    AnimalNode dqDog() {
        if (firstDog == null) {
            return new AnimalNode("Pet Rock", "Pet Rock");
        }
        AnimalNode temp = first;
        if (first == firstDog) {
            first = first.next;
        } else {
            while (temp.next != firstDog) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        AnimalNode dog = firstDog;
        firstDog = firstDog.nextSame;
        return dog;
    }

    AnimalNode dqCat() {
        if (firstCat == null) {
            return new AnimalNode("Pet Rock", "Pet Rock");
        }
        if (firstCat == first) {
            first = first.next;
        } else {
            AnimalNode temp = firstCat;

            while (temp.next != firstCat) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        AnimalNode cat = firstCat;
        firstCat = firstCat.nextSame;
        return cat;
    }

    void enq(AnimalNode newAnimal) {
        if (first == null) {
            first = newAnimal;
            last = newAnimal;
        } else {
            last.next = newAnimal;
            last = last.next;
        }

        if (newAnimal.type.equals("cat")) {
            enqCat(newAnimal);
        } else {
            enqDog(newAnimal);
        }
    }

    void enqCat(AnimalNode newCat) {
        if (firstCat == null) {
            firstCat = newCat;
            lastCat = newCat;
        } else {
            lastCat.nextSame = newCat;
            lastCat = lastCat.nextSame;
        }
    }

    void enqDog(AnimalNode newDog) {
        if (firstDog == null) {
            firstDog = newDog;
            lastDog = newDog;
        } else {
            lastDog.nextSame = newDog;
            lastDog = lastDog.nextSame;
        }
    }

    void printAnimals() {
        System.out.println("All Animals");
        AnimalNode temp = first;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    void printDogs() {
        System.out.println("All Dogs");
        AnimalNode temp = firstDog;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.nextSame;
        }
        System.out.print("null");
        System.out.println();

    }

    void printCats() {
        System.out.println("All Cats");
        AnimalNode temp = firstCat;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.nextSame;
        }
        System.out.print("null");
        System.out.println();

    }
}

class AnimalNode {
    AnimalNode next;
    AnimalNode nextSame;
    String type;
    String name;

    public AnimalNode(String name, String type) {
        this.name = name;
        this.type = type;
    }
}