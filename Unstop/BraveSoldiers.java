// Problem Statement
// King Luther has an army with N soldiers, each with an ID between 1 and N. The king wants to know how many soldiers in his army are "brave."

// A soldier is considered "brave" if their ID has exactly two factors (or Divisors) and is not a perfect square.

// Since King Luther is busy with his duties, he needs your help to count the number of "brave" soldiers in his army.

// Your task is to count how many soldiers have "brave" IDs according to the criteria.
public class BraveSoldiers {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to count brave soldiers
    public static int countBraveSoldiers(int N) {
        int braveCount = 0;

        for (int soldierId = 1; soldierId <= N; soldierId++) {
            if (isPrime(soldierId) && !isPerfectSquare(soldierId)) {
                braveCount++;
            }
        }

        return braveCount;
    }

    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        int N = 100; // Example: size of the army
        System.out.println("Number of brave soldiers: " + countBraveSoldiers(N));
    }
}
