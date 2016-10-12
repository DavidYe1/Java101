package David;

import java.util.Scanner;

/**
 * Created by david on 13.09.2016.
 */
public class Animals {

    private String name;
    private int weight;
    private boolean hasOwner =false;
    private byte age;
    private long uid;
    private char favoriteChar;
    private double speed;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
        System.out.println("UID set to" + this.uid);
    }

    public void setUid(){
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uid = minNumber + (long) (Math.random() *(maxNumber - minNumber ) + 1);

    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public void setFavoriteChar(){
        int randomNumber = (int) (Math.random() *(126)+1);

        this.favoriteChar = (char) randomNumber;

        if(randomNumber == 32){

            System.out.println("Favorite character set to: Space");

        } else if(randomNumber == 10){

            System.out.println("Favorite character set to: New Line");

        } else {

            System.out.println("Favorite character set to: " + this.favoriteChar);

        }


        if((randomNumber > 97) && (randomNumber < 122)){

            System.out.println("Favorite character is a lowercase letter");

        }

        if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))){

            System.out.println("Favorite character is a letter");

        }

        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        switch(randomNumber){

            case 8:
                System.out.println("Favorite char set to backspace");
                break;
            case 10:
            case 11:
            case 12:
            default :
                    System.out.println();
        }

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    protected static void  countTo(int startingNumber){

        for (int i = startingNumber; i <= 100; i++) {

            if (i == 90) {
                continue;
            }

            System.out.println(i);
            
        }
    }

    protected  static void guesMyNumber(){

        int number;

        do {

            System.out.println("Guess my number up to 100:");

            while (!userinput.hasNextInt()){

                String numberEntered = userinput.next();
                System.out.printf("%s is not a number/n", numberEntered);

            }

            number = userinput.nextInt();

        } while (number != 50);
    }

    public  String makeSOund(){

        return "Grrr";
    }

    public static void speakAnimal(Animals randAnimal){

        System.out.println("Animal says " + randAnimal.makeSOund());
    }

    protected static int numberOfAnimals = 0;

    static Scanner userinput = new Scanner(System.in);

    public Animals() {
        numberOfAnimals++;

        int sumOfNumber ;
        System.out.println("Enter the name: /n");
        System.out.println("sumOfNumber");

        if (userinput.hasNextLine()) {

            this.setName(userinput.nextLine());
        }

        this.setFavoriteChar();
        this.setUid();

    }

    public static void main(String[] args) {

        Animals theAnimal = new Animals();

        int[] favoriteNumbers = new int[20];

        favoriteNumbers[0] = 100;

        String[] stringArrays = {"ddwq", "fds", "fsdfsd"};

        for (String word : stringArrays){

            System.out.println(word);

        }


    }
}
