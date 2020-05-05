package Ch3_Stacks_And_Queues.Q6_AnimalShelter;

import java.util.*;
import Ch3_Stacks_And_Queues.Q6_AnimalShelter.*;

/*
An animal shelter, which holds only dogs and cats, operates on a strictly 
"first in, first out" basis. People must adopt eitger the "oldest" 
(based on arrival time) of all animals at the animal shelter,
or they can select whether they would prefer a dog or a cat
(and will receive the oldest animal of that type).
They cannont select which specific animal they would like.
Create the data structures to contain this system and implement 
operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat. 
You may use the built in LinkedList structure.
*/
public class Solution {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        AnimalNode cat1 = new AnimalNode("Garfield", "cat");
        AnimalNode cat2 = new AnimalNode("Hello Kitty", "cat");
        AnimalNode cat3 = new AnimalNode("Tom", "cat");
        AnimalNode cat4 = new AnimalNode("Tabby", "cat");

        AnimalNode dog1 = new AnimalNode("Scooby", "dog");
        AnimalNode dog2 = new AnimalNode("Bethoven", "dog");
        AnimalNode dog3 = new AnimalNode("Air Bud", "dog");
        AnimalNode dog4 = new AnimalNode("Bolt", "dog");
        shelter.enq(dog1);

        shelter.enq(cat1);

        shelter.enq(cat2);
        shelter.enq(cat3);
        shelter.enq(cat4);

        shelter.enq(dog2);
        shelter.enq(dog3);
        shelter.enq(dog4);
        /////////
        shelter.printAnimals();
        shelter.printDogs();
        shelter.printCats();

        shelter.dqAny();
        shelter.dqCat();
        shelter.dqDog();
        shelter.dqAny();

        shelter.printAnimals();
        shelter.printDogs();
        shelter.printCats();
    }
}