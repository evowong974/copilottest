package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     // instiates a dog object
        dog myDog = new dog("biscuit", "white lab", 1, "White");

        // create an array list of dogs and add the dog object to it
        ArrayList<dog> dogs = new ArrayList<dog>();
        dogs.add(myDog);
        // create a loop that instiates and adds 5 dogs to the arraylist
        for (int i = 0; i < 5; i++) {
            dogs.add(new dog());
        }
        // give each dog a name without a loop
        dogs.get(0).setName("Biscuit");
        dogs.get(1).setName("Fido");
        dogs.get(2).setName("Spot");
        dogs.get(3).setName("Rover");
        dogs.get(4).setName("Lassie");

        // create a loop that makes each dog bark random number of times
        for (dog d : dogs) {
            d.setBarked((int) (Math.random() * 10));
        
      
        }
        
        // create a loop that prints out the name of each dog in the arraylist
        for (dog d : dogs) {
            System.out.println(dogs.get(dogs.indexOf(d)));
        }
        // creates a loop that prints out the number of times a dog has barked
        for (dog d : dogs) {

            System.out.println(d.getName() + "barked " + (d.getBarked() + " times"));

        }
    

    }
}
