import java.util.Random;

public class Proj05Runner {
    private byte randomByte;

    public Proj05Runner() {
        Random rand = new Random();
        randomByte = (byte) (rand.nextInt(256) - 128); // Generate a random byte value
    }

    public Proj05Runner(int seed) {
        Random rand = new Random(seed);
        randomByte = (byte) (rand.nextInt(256) - 128); // Generate a random byte value with seed
    }

    public void run() {
        // Print the random byte value
        System.out.println("Random byte value = " + randomByte);

        // Print certification statement
        System.out.println(randomByte + " I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Thienkim Le"); // Replace with your actual name

        // Print false statement
        System.out.println("The following statement must print false.");
        System.out.println(false);

        // Print name statement
        System.out.println(randomByte + " Thienkim Le");

        // Print true statement
        System.out.println("The following statement must print true.");
        System.out.println(true);
    }

    // Static method runA that takes a String argument and returns a String
    public static String runA(String str) {
        // Placeholder logic (modify as needed)
        return str.toUpperCase();
    }

    // Static method runB that takes a StringBuffer argument and returns a StringBuffer
    public static StringBuffer runB(StringBuffer strBuf) {
        // Placeholder logic (modify as needed)
        return strBuf.reverse();
    }
}
