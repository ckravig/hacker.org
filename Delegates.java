import java.lang.Math;

public class Delegates {

    // Hacker.org Challenge

    // https://www.hacker.org/challenge/chal.php?id=115

    // Barack and Hillary are counting over a cup of coffee. Barack is counting slowly up to 2118.
    // Each time he says a number, Hillary adds it to a running total. However,
    // whenever the number is a perfect square, she gets so excited she adds it twice!
    // What total does she arrive at?

    public static void main(String[] args) {

        // Number to count to
        int finalNum = 2118;

        // Iterator
        int currNum = 0;

        // Running total
        int total = 0;

        // Formatting for output
        System.out.println("Perfect Squares:");

        // While we haven't reached the final number
        while (currNum <= finalNum) {
            if (isPerfectSquare(currNum)) {
                // If it's a perfect square, add it twice
                total += (currNum * 2);
            }else {
                total += currNum;
            }
            currNum++;
        }
        System.out.println("------------------");
        System.out.println("Total: " + total);
    }

    public static boolean isPerfectSquare(int currNum){

        if (Math.sqrt(currNum) % 1 == 0) {
            // Print perfect squares
            System.out.println(currNum);
            return true;
        } else {
            return false;
        }
    }

}
