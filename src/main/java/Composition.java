import java.util.Random;

/**
 * A random number generator that utilizes composition with java.util.Random class.
 */

class MyRandom {
    private Random random;

    /**
     * Constructs a new instance of MyRandom and initializes the composed Random instance.
     */

    public MyRandom() {
        random = new Random();
    }

    /**
     * Generates a random int between the specified lower and upper limits (inclusive).
     *
     * @param lowerLimit the lower limit of the random number range
     * @param upperLimit the upper limit of the random number range
     * @return a random integer between the lower and upper limits
     */
    
    public int getRandomNumber(int lowerLimit, int upperLimit) {
        int randomNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        return randomNumber;
    }
}

/**
 * Demonstration of composition adaptation by using MyRandom class
 */
public class Composition{
    public static void main(String[] args) {
        MyRandom myRandom = new MyRandom();
        int randomNumber = myRandom.getRandomNumber(10, 20);
        System.out.println("Random Number (Composition): " + randomNumber);
    }
}
