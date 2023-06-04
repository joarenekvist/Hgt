import java.util.Random;

/**
 * A random number generator that extends java.util.Random class through inheritance.
 */

class MyRandom extends Random {

    /**
     * Generates a random int between the specified lower and upper limits (inclusive).
     *
     * @param lowerLimit the lower limit of the random number range
     * @param upperLimit the upper limit of the random number range
     * @return a random integer between the lower and upper limits
     */
    public int getRandomNumber(int lowerLimit, int upperLimit) {
        int randomNumber = nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        return randomNumber;
    }
}

/**
 * Demonstration of inheritance adaptation by using MyRandom class
 */

public class Inheritance {
    public static void main(String[] args) {
        MyRandom myRandom = new MyRandom();
        int randomNumber = myRandom.getRandomNumber(10, 20);
        System.out.println("Random Number (Inheritance): " + randomNumber);
    }
}
