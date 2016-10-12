package David;

/**
 * Created by david on 13.09.2016.
 */

public class Cats extends Animals {
    public Cats() {

    }

    public String makeSound(){

        return "Meow";
    }

    public static void main(String[] args) {

        Animals fido = new Dogs();
        Animals snowball = new Cats();

        Animals[] theAnimals = new Animals[10];

        theAnimals[0] = fido;
        theAnimals[1] = snowball;

        System.out.println("Fido says: " + theAnimals[0].makeSOund());
        System.out.println("Snowball says: " + theAnimals[1].makeSOund());

        speakAnimal(snowball);
    }
}




